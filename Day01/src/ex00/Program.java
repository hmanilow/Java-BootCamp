public class Program
{
    public static void main(String[] args)
    {
        User hmanilow = new User(0, "hmanilow", 850);
        User kdakota = new User(1, "kdakota", 210);

        Transaction t0 = new Transaction(0,hmanilow, kdakota, Typ.CREDITS, 50);

        System.out.println(hmanilow.getBalance());
        System.out.println(kdakota.getBalance());

    }
}