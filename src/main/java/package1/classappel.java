package package1;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Strings;

public class classappel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Strings.isNullOrEmpty(null));
		System.out.println(Strings.isNullOrEmpty(""));
		System.out.println(Strings.isNullOrEmpty("55"));
		System.out.println(StringUtils.isEmpty(null));
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isEmpty("5"));
		
	}

}
