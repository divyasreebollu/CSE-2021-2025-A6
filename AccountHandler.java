Create a method for inserting accounts.
To pass this challenge, create an Apex class that inserts a new account named after an incoming parameter. If the account is successfully inserted, the method should return the account record. If a DML exception occurs, the method should return null.
The Apex class must be called AccountHandler and be in the public scope
The Apex class must have a public static method called insertNewAccount
The method must accept an incoming string as a parameter, which will be used to create the Account name
The method must insert the account into the system and then return the record
The method must also accept an empty string, catch the failed DML and then return null

in develop console write code:

public class AccountHandler {
    public Static Account insertNewAccount(String AccountName)
    {
        Account acct=new Account(name=AccountName);
        try{
            insert acct;
        }
        catch(DMLException e){
            return null;
        }
        return acct;
    }
}

apex code:AccountHandler.insertNewAccount('new test account');