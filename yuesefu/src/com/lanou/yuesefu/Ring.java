package com.lanou.yuesefu;

import java.util.Arrays;

public class Ring {
	static final int KILL_COUNT = 3;
	public static void main(String[] args) {
		int iArr[] = {1,1,1,1,1,1,1,1,1,1};
		System.out.println("之前："+Arrays.toString(iArr));
		ring(iArr,3);
		System.out.println("之后："+Arrays.toString(iArr));
	}
	private static void ring(int[] iArr, int live) {
		//计数器
		int count = 0;
		int liveCount = iArr.length;
		for (int i = 0; i < iArr.length;) {
			//没有死才计数
			if(iArr[i] == 1) {
				count++;
				if(count >=KILL_COUNT) {
					iArr[i] = 0;
					count = 0;
					liveCount--;
					//自杀后，判断如果活着的人与要求一致，退出
					if(liveCount == live) {
						break;
					}
				}
			}
			i++;
			if(i == iArr.length) {
				i=0;
			}
		}
		
	}
	
}
