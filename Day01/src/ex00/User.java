public class User
{
    int id;
    String name;
    int balance;

    User(int id, String name, int balance)
    {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }
}