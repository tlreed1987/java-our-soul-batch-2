package com.example;

public class DynamicList<T>{
		private int [] list;
		private int index;
		
		public DynamicList() {
			list=new int[100];
			index=-1;
		}
		
		public DynamicList(int size) {
			list=new int[size];
			index=-1;
		}
		
		public int size() {
			//do not change this code
			return index+1;
		}
		
		public void add(int number) {
			//logic
			//index=index+1;
			list[++index]=number;
		}
	
		public String toString() {
			StringBuilder sb=new StringBuilder("[");
			for(int i=0; i<=index;i++) {
				sb.append(list[i]+",");
			}
			// to fix the issue by removing additional , 
			sb.append("]");
			return sb.toString();
		}
		
		public void remove(int index) {
			//logic
		}

}
