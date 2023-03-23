public class Account {
    private long acc_no;
    private String name ,email;
    private float amount;
    public long getAcc_no()
    {
        return acc_no;
    }
    public void setAcc_no(long acc_no) { this.acc_no=acc_no; }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
    public float getAmount()
    {
        return amount;
    }
    public void setAmount(float amount)
    {
        this.amount=amount;
    }

    public static void main(String[] args) {
        Account saksham =new Account();
        saksham.setAcc_no(12111097);
        saksham.setName("Saksham");
        saksham.setEmail("saks@mail.com");
        saksham.setAmount(100);

        System.out.println("Name is : "+saksham.getName());
        System.out.println("Account number is : "+saksham.getAcc_no());
        System.out.println("Email is : "+saksham.getEmail());
        System.out.println("Balance is : "+saksham.getAmount());
    }
}
