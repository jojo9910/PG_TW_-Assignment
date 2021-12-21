package com.exceptionhandling;

    class MyException extends Exception {
        private int param;

        MyException(int param) {
            this.param = param;
        }

        public String toString() {
            return "MyException[" + param + "]";
        }
    }