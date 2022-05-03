package codes;
class May02 {
    public static void main(String[] args){
        /*
        int a;
        a = 1;
        System.out.println(a);

        int b[];
        b = new int[3];
        b[0] = 100;
        b[1] = 200;
        b[2] = 300;
        for (int i = 0; i<b.length; i++) System.out.print(b[i] + " ");
        */
        Student c = new Student(5, "Jinho", 100.0, 1);
        printStudent(c);
    }
    public static void printStudent(Student s){
        System.out.println(s.classNum + "반 " + s.num + "번 " + s.name + "의 국어점수는: " + s.kor);
    }
}