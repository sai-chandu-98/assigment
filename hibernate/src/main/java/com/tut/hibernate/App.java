package com.tut.hibernate;

import com.tut.hibernate.dao.RegisterDao;

import com.tut.hibernate.entity.UserRegistration;

public class App 
{
    public static void main( String[] args )
    {
      UserRegistration registration =new UserRegistration();
      registration.setId(123);
      registration.setUsername("sai");
      registration.setPassword("password");
      registration.setEmail("saichanduanumula1998@gmail.com");
          registration.setMobilenumber("12344445");
      
      RegisterDao registerDao =  new RegisterDao();
      registerDao.saveUser(registration);
     // System.out.println(userRegistration);
    }
}
