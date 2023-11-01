package jp.co.diworks.action;

public class Test {
	public static void main(String [] args){

		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "000-0000-0000";
		taro.address = "東京";

		Person kimura = new Person();
		kimura.name = "木村次郎";
		kimura.age = 18;
		kimura.phoneNumber = "000-1111-2222";
		kimura.address = "埼玉";

		Person suzuki = new Person();
		suzuki.name = "鈴木花子";
		suzuki.age = 16;
		suzuki.phoneNumber = "111-2222-3333";
		suzuki.address = "千葉";

		Person ohara = new Person();
		ohara.name = "大原陽";
		ohara.age = 23;
		ohara.phoneNumber = "222-3333-4444";
		ohara.address = "京都";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.walk();
		taro.talk();
		taro.run();
		System.out.println(kimura.name);
		System.out.println(kimura.age);
		System.out.println(kimura.phoneNumber);
		System.out.println(kimura.address);
		kimura.walk();
		kimura.talk();
	    kimura.run();
		System.out.println(suzuki.name);
		System.out.println(suzuki.age);
		System.out.println(suzuki.phoneNumber);
		System.out.println(suzuki.address);
		suzuki.walk();
		suzuki.talk();
		suzuki.run();
		System.out.println(ohara.name);
		System.out.println(ohara.age);
		System.out.println(ohara.phoneNumber);
		System.out.println(ohara.address);
		ohara.walk();
		ohara.talk();
		ohara.run();

		Robot Aibo = new Robot();
		Aibo.name = "アイボ";
		System.out.println(Aibo.name);
		Aibo.talk();
		Aibo.walk();
		Aibo.run();

		Robot Asimo = new Robot();
		Asimo.name = "アシモ";
		System.out.println(Asimo.name);
		Asimo.talk();
		Asimo.walk();
		Asimo.run();

		Robot Pepper = new Robot();
		Pepper.name = "ペッパー";
		System.out.println(Pepper.name);
		Pepper.talk();
		Pepper.walk();
		Pepper.run();
	}

}
