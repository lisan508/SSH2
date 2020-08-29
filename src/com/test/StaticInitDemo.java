package com.test;

 class StaticInitDemo {
static int i = 5;
static {
System.out.println("Static code i= "+ i++ );
}
}
