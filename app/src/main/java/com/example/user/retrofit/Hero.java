package com.example.user.retrofit;

public class Hero {


        private Employees[] employees;

        public Employees[] getEmployees ()
        {
            return employees;
        }

        public void setEmployees (Employees[] employees)
        {
            this.employees = employees;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [employees = "+employees+"]";
        }
    }

