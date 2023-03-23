public class Some_name {
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
