package vecka4.Övning.ovn;

public class User {
   private String userName,password, typeUser = "normal",email ="";
    private String[] emailArray = null;
    private int loggatInAntal = 0, solidus = 5,hoodie = 0,t_shirt = 0,sticker = 0,indexEmail = 0,indexEmailModulus;

    public User(String userName,String password)
    {
        this.userName = userName;
       // if(password.length() >= 7 && password.length() <= 20 && password.contains("!$#&"))
            this.password = password;
        emailArray = new String[4];
    }
    public void logIn(String userName,String password)
    {
        if(this.userName.equals(userName) && this.password.equals(password)) {
            loggatInAntal++;
            changeAmountOfSolidus(1);
        }
        if(loggatInAntal == 20) {
            setTypeUser("gold member");
            changeAmountOfSolidus(20);
        }
    }
    public void changeAmountOfSolidus(int amountChange)
    {
        solidus = solidus + amountChange;
        if(solidus < 0)
            System.out.println("Du har ej råd!");
    }
    public int kopMerchen(int hoodie,int t_shirt,int sticker)
    {
        int kostnad = 20 * hoodie + 15 * t_shirt + 5 * sticker;
        changeAmountOfSolidus(-kostnad);
        return solidus;
    }

    public String[] getEmailArray() {
        return emailArray;
    }

    public void setEmail(String email) {
        boolean emailAlreadyExist = false;
        for(int i = 0; i < 4; i++)
        {
            if(email.equals(emailArray[i]))
                emailAlreadyExist = true;
        }


        if(email.contains("@") && !emailAlreadyExist) {
            this.email = email;
            indexEmailModulus = indexEmail % 4;
            this.emailArray[indexEmailModulus] = email;
            indexEmail++;
        }
    }

    public String getEmail() {
        return email;
    }

    public void deleteEmail(int i)
    {
        if(i >= 0 && i < 4)
            this.emailArray[i] = "";
    }
    public int fragaHurMangaEmailFinns()
    {
        int antalEmail = 0;
        for(int i = 0; i < emailArray.length;i++)
        {
            if(!emailArray[i].equals(""))
                antalEmail++;
        }
        return antalEmail;
    }
    public void setSolidus(int solidus) {
        this.solidus = solidus;
    }

    public int getSolidus() {
        return solidus;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() >= 7 && password.length() <= 20 &&
                (password.contains("!")|| password.contains("$")||password.contains("#")||password.contains("&"))
        && !(password.toUpperCase()).equals(password)&& !(password.toLowerCase()).equals(password))
            this.password = password;
    }

    public void setUserName(String userName) {
        if(userName.length() >= 4)
            this.userName = userName;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        if(typeUser == "normal" || typeUser == "admin" || typeUser == "super" || typeUser == "gold member")
            this.typeUser = typeUser;
    }

}
