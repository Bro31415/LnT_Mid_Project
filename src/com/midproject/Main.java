package com.midproject;

import java.util.Scanner;
import java.util.Random;


public class Main {
    Scanner scan = new Scanner(System.in);
    public Main() {
        menu();
    }

    int min = 1000;
    int max = 9999;
    String name;
    char L;
    char P;
    String Manager;
    String Supervisor;
    String Admin;
    String jabatan;
    int salary;
    String gender;
    int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);

    private void menu() {
        int select;

        do {
            System.out.println("1. Insert Employee Data");
            System.out.println("2. View Employee Data");
            System.out.println("3. Update Employee Data");
            System.out.println("4. Delete Employee Data");
            System.out.println("5. Exit");
            System.out.println("Choose : ");
            select = scan.nextInt();
            System.out.println();

            if (select == 1)
                input();
            else if (select == 2)
                view();
            //else if (select == 3)
               //edit();
            //else if (select == 4)
                //delete();
            else
                exit();
        } while (select != 5);
    }
    private void input(){


        System.out.println("Kode Karyawan : " + randomNum);


        do {
            System.out.println("Nama Karyawan : ");
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            name = scan.next();
        } while (name.toString().length()<3);

            do {
                System.out.println("Pilih Jenis Kelamin (L/P): ");
                gender = scan.next();
                //gender = scan.next().charAt(0);
            } while (!gender.equals("L") || gender.equals("P"));

       /*   do {
                      System.out.println("Pilih jabatan (Manager/Supervisor/Admin): ");
                      jabatan = scan.next();
          } while (!jabatan.equals("Manager") || !jabatan.equals("Admin") || !jabatan.equals("Supervisor"));  */

        System.out.println("Berhasil menambahkan karyawan dengan id : " + randomNum);


    /*    class Employee {
            public void view() {
                System.out.println(name);
                System.out.println(gender);
                System.out.println(jabatan);
            }

        class Employee extends Manager {
                @Override
                public void view() {
                    int salary = 8000000;
                }
        }

        class Employee extends Supervisor {
                @Override
                public void view(){
                    int salary = 6000000;
                }
        }

        class Employee extends Admin {
                @Override
                public void view(){
                    int salary = 4000000;
                }
        }
*/
    }

    private void view(){
        System.out.println("Nama : " +name);
        System.out.println("Id : " + randomNum);
    }

    private void exit(){

    }

    public static void main(String[] args) {
        new Main();
    }
    }




