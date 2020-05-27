package student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int A = 0, B = 0;
        String namefile = null;
        String[] AR = null;
        ArrayList<ArrayList<String>> mass1 = new ArrayList<ArrayList<String>>();
        System.out.println("Введите название файла --");

        boolean c = false;
        while (c == false) {
            namefile = GetText();
            File file = new File(namefile);
            if (file.exists()) {
                c = true;

            } 
            else {
                System.out.println("Вы ошиблись или файла не существует!");
                c = false;
            }
        }
        try {
            FileReader FR = new FileReader(namefile);
            BufferedReader BR = new BufferedReader(FR);
            String S = "";
            while ((S = BR.readLine()) != null) {
                ArrayList<String> mass = new ArrayList<String>();
                AR = S.split(";");
                for (int i = 0; i < 5; i++) {
                    mass.add(AR[i]);
                }
                mass1.add(mass);
                mass = null;
            }
            

        } catch (Exception e) {
            System.out.println("ошибка");
        }
        System.out.println("Как хотите отсортировать список студентов? Введите число!");
        System.out.println("0 ---> Сортировка по ФИО "
                + "\n1 ---> Сортировка по Институту "
                + "\n2 ---> Сортировка по Возрасту"
                + "\n3 ---> Сортировка по Баллам"
                + "\n4 ---> Сортировка по наличии стипендии");
        c = false;
        while (c == false) {
            A = GetNumber();
            if (0 <= A && A <= 4) {
                c = true;

            } else {
                System.out.println("Вы ошиблись. Попробуйте еще!");
                c = false;
            }
        }
        if (A == 0) {
            System.out.print("Сортировка по возрасстанию или по убыванию?(write 1 or 0)");
            c = false;
            while (c == false) {
                B = GetNumber();
                if (B <= 1 && B >= 0) {
                    c = true;
                    if (B == 0) {
                        System.out.println("Список студентов отсортирован по возростанию!");
                        Student[] s = SortName(ListOfStudents(mass1));
                        for (Student j : s) {
                            j.Result();
                        }
                        FileWrite(SortName(ListOfStudents(mass1)));
                    } else if (B == 1) {
                        System.out.println("Список студентов отсортирован по убыванию!");
                        Student[] s = ReverseList(SortName(ListOfStudents(mass1)));
                        for (Student j : s) {
                            j.Result();
                        }
                        FileWrite(ReverseList(SortName(ListOfStudents(mass1))));
                    }
                } else {
                    System.out.println("Введите 0 либо 1, для сортировки");
                    c = false;

                }

            }
        }
        if (A == 1) {
            System.out.print("Сортировка по возрасстанию или по убыванию?(write 1 or 0)");
            c = false;
            while (c == false) {
                B = GetNumber();
                if (B <= 1 && B >= 0) {
                    c = true;
                    if (B == 0) {
                        System.out.println("Список студентов отсортирован по возростанию!");
                        Student[] s = SortInst(ListOfStudents(mass1));
                        for (Student j : s) {
                            j.Result();
                        }
                        FileWrite(SortInst(ListOfStudents(mass1)));
                    } else if (B == 1) {
                        System.out.println("Список студентов отсортирован по убыванию!");
                        Student[] s = ReverseList(SortInst(ListOfStudents(mass1)));
                        for (Student j : s) {
                            j.Result();
                        }
                        FileWrite(ReverseList(SortInst(ListOfStudents(mass1))));
                    }
                } else {
                    System.out.println("Введите 0 либо 1, для сортировки");
                    c = false;

                }

            }
        }
        if (A == 2) {
            System.out.print("Сортировка по возрасстанию или по убыванию?(write 1 or 0)");
            c = false;
            while (c == false) {
                B = GetNumber();
                if (B <= 1 && B >= 0) {
                    c = true;
                    if (B == 0) {
                        System.out.println("Список студентов отсортирован по возростанию!");
                        Student[] s = SortAge(ListOfStudents(mass1));
                        for (Student j : s) {
                            j.Result();
                        }
                        FileWrite(SortAge(ListOfStudents(mass1)));
                    } else if (B == 1) {
                        System.out.println("Список студентов отсортирован по убыванию!");
                        Student[] s = ReverseList(SortAge(ListOfStudents(mass1)));
                        for (Student j : s) {
                            j.Result();
                        }
                        FileWrite(ReverseList(SortAge(ListOfStudents(mass1))));
                    }
                } else {
                    System.out.println("Введите 0 либо 1, для сортировки");
                    c = false;

                }

            }
        }
        if (A == 3) {
            System.out.print("Сортировка по возрасстанию или по убыванию?(write 1 or 0)");
            c = false;
            while (c == false) {
                B = GetNumber();
                if (B <= 1 && B >= 0) {
                    c = true;
                    if (B == 0) {
                        System.out.println("Список студентов отсортирован по возростанию!");
                        Student[] s = SortPoint(ListOfStudents(mass1));
                        for (Student j : s) {
                            j.Result();
                        }
                        FileWrite(SortPoint(ListOfStudents(mass1)));
                    } else if (B == 1) {
                        System.out.println("Список студентов отсортирован по убыванию!");
                        Student[] s = ReverseList(SortPoint(ListOfStudents(mass1)));
                        for (Student j : s) {
                            j.Result();
                        }
                        FileWrite(ReverseList(SortPoint(ListOfStudents(mass1))));
                    }
                } else {
                    System.out.println("Введите 0 либо 1, для сортировки");
                    c = false;

                }

            }
        }
        if (A == 4) {
            System.out.print("Сортировка по возрасстанию или по убыванию?(write 1 or 0)");
            c = false;
            while (c == false) {
                B = GetNumber();
                if (B <= 1 && B >= 0) {
                    c = true;
                    if (B == 0) {
                        System.out.println("Список студентов отсортирован по возростанию!");
                        Student[] s = SortSteep(ListOfStudents(mass1));
                        for (Student j : s) {
                            j.Result();
                        }
                        FileWrite(SortSteep(ListOfStudents(mass1)));
                    } else if (B == 1) {
                        System.out.println("Список студентов отсортирован по убыванию!");
                        Student[] s = ReverseList(SortSteep(ListOfStudents(mass1)));
                        for (Student j : s) {
                            j.Result();
                        }
                        FileWrite(ReverseList(SortSteep(ListOfStudents(mass1))));
                    }
                } else {
                    System.out.println("Введите 0 либо 1, для сортировки");
                    c = false;

                }

            }
        }

    }

    public static Student[] ListOfStudents(ArrayList<ArrayList<String>> S) {
        Student[] students = new Student[S.size()];
        for (int i = 0; i < S.size(); i++) {
            String[] g = S.get(i).get(3).split(" ");
            int[] point = new int[g.length];
            for (int j = 0; j < g.length; j++) {
                point[j] = Integer.parseInt(g[j]);
            }
            students[i] = new Student(S.get(i).get(0), S.get(i).get(1),
                    Integer.parseInt(S.get(i).get(2)), point, Boolean.parseBoolean(S.get(i).get(4)));

        }

        return students;
    }

    public static Student[] SortAge(Student[] ST) {
        //Сортировка по возрасту студентов
        for (int i = 0; i < ST.length - 1; i++) {
            for (int j = i + 1; j < ST.length; j++) {
                if (ST[i].GetAge() > ST[j].GetAge()) {
                    Student s = ST[i];
                    ST[i] = ST[j];
                    ST[j] = s;

                }
            }
        }
        return ST;
    }

    public static Student[] SortSteep(Student[] ST) {
        //Сортировка по наличии стипендии студентов
        ArrayList<Student> STNew = new ArrayList<Student>();
        Student[] stud = new Student[ST.length];
        for (Student ST1 : ST) {
            if (ST1.GetSteep() == false) {
                STNew.add(ST1);
            }
        }
        for (Student ST1 : ST) {
            if (ST1.GetSteep() == true) {
                STNew.add(ST1);
            }
        }

        for (int k = 0; k < STNew.size(); k++) {
            stud[k] = STNew.get(k);
        }

        return stud;
    }

    public static Student[] SortName(Student[] ST) {
        //Сортировка ФИО по алфовиту.
        for (int i = 0; i < ST.length - 1; i++) {
            for (int j = i + 1; j < ST.length; j++) {
                if (ST[i].GetName().compareTo(ST[j].GetName()) >= 0) {
                    Student s = ST[i];
                    ST[i] = ST[j];
                    ST[j] = s;

                }
            }
        }

        return ST;
    }

    public static Student[] SortPoint(Student[] ST) {
        //Сортировка баллов. 
        for (int i = 0; i < ST.length - 1; i++) {
            for (int j = i + 1; j < ST.length; j++) {
                if (ST[i].GetMdPoints() < ST[j].GetMdPoints()) {
                    Student s = ST[i];
                    ST[i] = ST[j];
                    ST[j] = s;

                }
            }
        }

        return ST;
    }

    public static Student[] SortInst(Student[] ST) {
        //Сортировка Института по алфовиту.
        for (int i = 0; i < ST.length - 1; i++) {
            for (int j = i + 1; j < ST.length; j++) {
                if (ST[i].GetInst().compareTo(ST[j].GetInst()) >= 0) {
                    Student s = ST[i];
                    ST[i] = ST[j];
                    ST[j] = s;

                }
            }
        }
        return ST;

    }

    public static int GetNumber() {
        int range = 0;
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IS);
        String S;
        boolean c = false;
        while (c == false) {
            try {
                S = BR.readLine();
                range = Integer.parseInt(S);
                c = true;
            } catch (Exception e) {
                System.out.println("Вы ввели не число");
            }
        }
        return range;

    }

    public static String GetText() {
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IS);
        String S = null;
        boolean c = false;
        while (c == false) {
            try {
                S = BR.readLine();
                c = true;
            } catch (Exception e) {
                System.out.println("ошибка");
            }
        }
        return S;

    }

    public static void FileWrite(Student[] ST) {
        System.out.println("Введите название файла для записи --");
        String namefile = null;
        boolean c = false;
        while (c == false) {
            namefile = GetText();
            if (namefile.endsWith(".txt")) {
                c = true;

            } else {
                System.out.println("Ошибка!Введите с расширение txt"
                        + "");
                c = false;
            }
        }

        try {
            FileWriter FW = new FileWriter(namefile);
            for (Student s : ST) {
                FW.write(s.GetName() + "-" + s.GetInst() + "-" + Integer.toString(s.GetAge())
                        + "-" + Double.toString(s.GetMdPoints()) + "-" + Boolean.toString(s.GetSteep()) + "\r" + "\n");
                FW.flush();

            }

        } catch (Exception e) {
            System.out.println("ошибка!");
        }
        System.out.println("записано!");

    }
    public static Student[] ReverseList(Student[] ST){
        
        Student[] s = new Student[ST.length];
        for(int i=ST.length-1; i>=0; --i){
            s[ST.length - 1 - i] = ST[i];  
        }
        return s;

    }



}
