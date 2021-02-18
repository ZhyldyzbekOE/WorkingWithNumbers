package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

    private ArrayList<Integer> list = new ArrayList<>();
    private ArrayList<Integer> list2 = new ArrayList<>(); //list 2, 3 для создания уникальных списков.
    private ArrayList<Integer> list3 = new ArrayList<>();
    private ArrayList<Integer> list4 = new ArrayList<>(); //list 4, 5 для copy(), shuffle().
    private ArrayList<Integer> list5 = new ArrayList<>();

    public void randomFillList(){
        /*
            Заполнение рандомными числами list
        * */
        for(int i = 0; i < 100; i++)
        {
            list.add((int)(Math.random()*(100-1))+1);
        }
        for (Integer item: list) { // Вывод list
            System.out.print("| "+item+" | ");
        }
        System.out.println("\n");
    }

    public void maxNumInTheList(){
        /*
            Найти максимальное число
        */
        int maxNum = Collections.max(list);
        System.out.println("***********************************");
        System.out.println("Max number in the list - "+maxNum);
    }

    public void minNumInTheList(){
        /*
             Найти минимальное число
        * */
        int minNum = Collections.min(list);
        System.out.println("Min number in the list - "+minNum);
        System.out.println("***********************************");
        System.out.print("\n");
    }

    public void sort(){
        /*
            Отсортировать список
        * */
        Collections.sort(list);
        System.out.println("***********************************");
        System.out.println("Sorted list");
        for (Integer item: list) {
            System.out.print("| "+item+" | ");
        }
        System.out.print("\n");
        System.out.println("***********************************");
    }

    public void frequency(){
        /*
            Найти в этом списке числа 5, 7 и сколько раз они повторяются
        * */
        int firstNum = 5;
        int secondNum = 7;
        int number5 = Collections.frequency(list, firstNum);
        int number7 = Collections.frequency(list, secondNum);
        System.out.print("\n");
        System.out.println("***********************************");

        System.out.println("Number "+firstNum+" appears in the list - " + number5 + " times");
        System.out.println("Number "+secondNum+" appears in the list - " + number7 + " times");
        System.out.println("***********************************");
        System.out.print("\n");
    }

    public void createEqualsList(){
        /*
            Создать 2 списка из 10 элементов от 1 до 10.
            Проверить с какой попытки у вас получится создать списки с уникальными значениями
        * */

        int j = 0;
        for (int i = 0; i < 10; i++){
            list2.add((int)(Math.random()*(20-1))+1);
        }
        for (int i = 0; i < 10; i++){
            list3.add((int)(Math.random()*(20-1))+1);
        }
        while (true)
        {
            Collections.sort(list2);
            Collections.sort(list3);

            if (list2.equals(list3)){
                break;
            }else {
                for (int i = 0; i < 10; i++)
                {
                    list2.set(i, (int)(Math.random()*(20-1))+1);
                }
                for (int i = 0; i < 10; i++)
                {
                    list3.set(i,(int)(Math.random()*(20-1))+1);
                }
                j++;
            }
        }

        System.out.println("***********************************");
        System.out.println("Список с уникальными значениями: ");
        for (Integer item: list2) {
            System.out.print("| "+item+" | ");
        }
        System.out.println("\n");
        for (Integer item: list3) {
            System.out.print("| "+item+" | ");
        }
        System.out.println("\n");
        System.out.println("Количество попыток на создания списков с уникальными значениями: " + j);
        System.out.println("***********************************");
        System.out.println("\n");
    }

    public void copyList(){

        int k = 0;
        /*
            Создать список из 5 элементов с рандомными числами от 1 до 100. Создать копию этого списка.
            а. Перемешивать, пока порядок не станет прежним
        * */

        for (int i = 0; i < 5; i++){
            list4.add((int)(Math.random()*(100-1))+1);
        }
        for (int i = 0; i < 5; i++){
            list5.add(0);
        }
        Collections.copy(list5, list4);
        Collections.shuffle(list5);
        System.out.println("***********************************");
        System.out.println("Список после первого shuffle");
        for (Integer item: list5) {
            System.out.print("| "+item+" | ");
        }
        System.out.println("\n");
        while(true){
            if(list5.equals(list4)){
                //System.out.println("Shuffle есть");
                break;
            }else {
                Collections.shuffle(list5);
                k++;
            }
        }

        System.out.println("Исходный list: ");
        for (Integer item: list4) {
            System.out.print("| "+item+" | ");
        }
        System.out.println("\n");
        System.out.println("Конечный результат после подбора до исходных значений");
        for (Integer item: list5) {
            System.out.print("| "+item+" | ");
        }
        System.out.println("\n");
        System.out.println("Количество попыток на подбор до исходных значений: " + k);
        System.out.println("***********************************");
        System.out.println("\n");
    }
    public void sortByAscending(){
        /*
            Создать список из 5 элементов с рандомными числами от 1 до 100.
            Перемешивать, пока не будет отсортирован по возрастанию.
            Вывести количество попыток
        * */
        ArrayList<Integer> list6 = new ArrayList<>(); // start list
        ArrayList<Integer> list7 = new ArrayList<>(5); // copy list
        System.out.println("***********************************");
        for(int i = 0; i < 5; i++){
            list6.add((int)(Math.random()*(100-1))+1);
        }
        for(int i = 0; i < 5; i++) {
            list7.add(0);
        }
        int c = 0;
        Collections.copy(list7, list6);
        Collections.sort(list7); // создал копию list 6 - list 7, и отсортировал его по возростанию
        Collections.shuffle(list6);
        System.out.println("Лист 6 перемешан : ");
        for (Integer item: list6) {
            System.out.print("| "+item+" | ");
        }
        System.out.println("\n");
        while(true){
            if (list6.equals(list7)){
                System.out.println("Лист 6 отсорирован по возрастанию по методу shuffle");
                break;
            }else{
                Collections.shuffle(list6);
                c++;
            }
        }
        for (Integer item: list6) {
            System.out.print("| "+item+" | ");
        }
        System.out.println("\n");
        System.out.println("Количество попыток на сортировку по возр. по методу shuffle: " + c);
        System.out.println("***********************************");
    }
}
