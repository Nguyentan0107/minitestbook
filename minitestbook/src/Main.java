public class Main {
    public static void main(String[] args) {

        Book[] arrayBook = new Book[10];
        ProgrammingBook programmingBook = new ProgrammingBook("nnn","aa","b1","ten1",50,"Khong biet");
        ProgrammingBook programmingBook1 = new ProgrammingBook("java","aa","b1","ten1",50,"Khong biet");
        ProgrammingBook programmingBook2 = new ProgrammingBook("java","aa","b1","ten1",50,"Khong biet");
        ProgrammingBook programmingBook3 = new ProgrammingBook("java","aa","b1","ten1",50,"Khong biet");
        ProgrammingBook programmingBook4 = new ProgrammingBook("java","aa","b1","ten1",50,"Khong biet");
        arrayBook[0] = programmingBook;
        arrayBook[1] = programmingBook1;
        arrayBook[2] = programmingBook2;
        arrayBook[3] = programmingBook3;
        arrayBook[4] = programmingBook4;
        FictionBook fictionBook6 =  new FictionBook("van hoc","c1","ten 6",30,"Chua ro");
        FictionBook fictionBook7 =  new FictionBook("van hoc","c1","ten 6",30,"Chua ro");
        FictionBook fictionBook8 =  new FictionBook("van hoc","c1","ten 6",30,"Chua ro");
        FictionBook fictionBook9 =  new FictionBook("van hoc","c1","ten 6",30,"Chua ro");
        FictionBook fictionBook10 =  new FictionBook("van hoc","c1","ten 6",30,"Chua ro");
        arrayBook[5] = fictionBook6;
        arrayBook[6] = fictionBook7;
        arrayBook[7] = fictionBook8;
        arrayBook[8] = fictionBook9;
        arrayBook[9] = fictionBook10;
        System.out.println("Tổng tiền của 10 cuốn sách:   "+ totalPrice(arrayBook));
        System.out.println("số sách language 'java':   " + sumJava(arrayBook));
        System.out.println("Số sách có giá < 100la:   " + sumFic100(arrayBook));
    }

    public static int totalPrice(Book[]array) {
        int count = 0;
        for (Book p : array) {
            count += p.getPrice();
        }
        return count;
    }
    public static int sumJava(Book[] array) {
        int sum = 0;
        for (Book book : array) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals("java")) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int sumFic100(Book[] array) {
        int sum = 0;
        for (Book book : array) {
            if (book.getPrice() < 100) {
                sum++;
            }
        }
        return sum;
    }
}