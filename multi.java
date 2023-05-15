interface Clerk {
    int csal = 10000;
}

interface Peon {
    int psal = 8000;
}

class multi implements Clerk, Peon {

    int tsal;

    void findSal() {
        tsal = csal + psal;
        System.out.println("Clerk Salary is :" + csal);
        System.out.println("Peon Salary is :" + psal);
        System.out.println("Total Salary is :" + tsal);
    }

    public static void main(String args[]) {
        Main ad = new Main();
        ad.findSal();
    }
}