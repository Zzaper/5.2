 Scanner scr = new Scanner(System.in);

        int n = Integer.parseInt(scr.next());
        for (int i = 0;i < n - 2;i++)
        {
            char wingMaterial = i % 2 == 0 ? '*' : '-';
            String wings = Repeat(wingMaterial, n - 2);
            String line = wings + "\\ /" + wings;
            System.out.println(line);
        }

        System.out.printf("%s@%s%n", Repeat(' ', n - 1), Repeat(' ', n - 1));
        for (int i = 0;i < n - 2;i++)
        {
            char wingMaterial = i % 2 == 0 ? '*' : '-';
            String wings = Repeat(wingMaterial, n - 2);
            String line = wings + "/ \\" + wings;
            System.out.println(line);
        }

    }
    public static String Repeat(char ch,int n) {
        return new String(new char[n]).replace("\0", "" + ch);

