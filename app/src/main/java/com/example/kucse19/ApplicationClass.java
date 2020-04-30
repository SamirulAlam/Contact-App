package com.example.kucse19;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Student> students;

    @Override
    public void onCreate() {
        super.onCreate();
        students=new ArrayList<>();
        students.add(new Student("eva","Naima Azmeen","190203","01789044052","Shatkhira","Bangamata Begum Fazilatunnesa Mujib Hall","O+"));
        students.add(new Student("sahriar","Md Shahriar Kabir","190204","01956443656","Jashore","Khan Bahadur Ahsaanullah Hall","A+"));
        students.add(new Student("dev","Debasish Biswas","190206","01742981825","Khulna","Jatir Janak Bangabandhu Sheikh Mujibur Rahman Hall","B+"));
        students.add(new Student("masum","Masum Rayhan","190207","01709115882","Pirojpur","Jatir Janak Bangabandhu Sheikh Mujibur Rahman Hall","B+"));
        students.add(new Student("tanveer","Tanvir Hasan","190208","01989567109","Jashore","Jatir Janak Bangabandhu Sheikh Mujibur Rahman Hall","O+"));
        students.add(new Student("arnab","Arnab Purkayastha","190209","01765897982","Sylet","Khan Jahan Ali Hall","B+"));
        students.add(new Student("asif","Asif Mahmud","190210","01724080981","Rangpur","Khan Jahan Ali Hall","B+"));
        students.add(new Student("mondal","Saykat Mondal","190211","01745272595","Khulna","Jatir Janak Bangabandhu Sheikh Mujibur Rahman Hall","A+"));
        students.add(new Student("shafi","Musfiq Shahriar Shafi","190212","01748213616","Jashore","Khan Jahan Ali Hall","B+"));
        students.add(new Student("sujon","Sujan Kumar Dhali","190213","01757405814","Satkhira","Jatir Janak Bangabandhu Sheikh Mujibur Rahman Hall","A+"));
        students.add(new Student("mahi","Sadman Sakib","190214","01920986387","Dhaka","Khan Jahan Ali Hall","B+"));
        students.add(new Student("urme","Nusrat Jahan Urme","190215","01872121052","Meherpur","Bangamata Begum Fazilatunnesa Mujib Hall","O+"));
        students.add(new Student("fida","Fida Talbia","190216","01677262022","Chottogram","Bangamata Begum Fazilatunnesa Mujib Hall","AB+"));
        students.add(new Student("oni","Asfia Shahnaj","190218","01996731177","Barisal","Bangamata Begum Fazilatunnesa Mujib Hall","O+"));
        students.add(new Student("samir","Md. Samirul Alam","190219","01864306492","Rangpur","Khan Bahadur Ahsaanullah Hall","O+"));
        students.add(new Student("nuhas","Md Nuhas Morataza","190220","01966949025","Khulna","Khan Bahadur Ahsaanullah Hall",""));
        students.add(new Student("rahul","Md Rahul Islam","190221","01724183818","Kustia","Khan Jahan Ali Hall","B+"));
        students.add(new Student("mehedi","Md. Mehedi Hasan","190222","01783771942","Rangpur","Khan Jahan Ali Hall",""));
        students.add(new Student("noor","Noor Mohammud","190223","01783336372","Gopalgonj","Jatir Janak Bangabandhu Sheikh Mujibur Rahman Hall",""));
        students.add(new Student("sammi","Sinthia Rahman Shammi","190225","01302359677","Jashore","Aparijita Hall","B+"));
        students.add(new Student("meem","Nishat Tasneem Meem","190230","01823363300","Dhaka","Aparijita Hall","B+"));
        students.add(new Student("monir","Moniruzzaman","190231","01762052126","Jashore","Jatir Janak Bangabandhu Sheikh Mujibur Rahman Hall","B+"));
        students.add(new Student("rois","Shaikh Rais Rahman","190232","01817156055","Khulna","Khan Jahan Ali Hall","O+"));
        students.add(new Student("motiur","Md. Motiur Rahman","190233","01521115031","Bogura","Khan Jahan Ali Hall","B+"));
        students.add(new Student("sakib","Saifuddin Mahmud","190235","01626396657","Chottogram","Khan Jahan Ali Hall","O+"));
        students.add(new Student("biswas","Sykat Biswas","190236","01632026856","Norail","Jatir Janak Bangabandhu Sheikh Mujibur Rahman Hall","AB+"));
        students.add(new Student("jweal","Din Muhammad","190237","01980445424","Satkhira","Khan Bahadur Ahsaanullah Hall","B+"));
        students.add(new Student("azhar","Azharuddin","190238","01733979152","Shatkhira","Khan Jahan Ali Hall","O+"));
        students.add(new Student("amit","Amit Mazumadar","190243","01795177267","Pirojpur","Khan Jahan Ali Hall","B+"));
    }
}
