package com.hanwha.hive_web.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;

/**
 * 
 * <p>
 * 문자열과 관련된 유틸리티 클래스입니다.<br/>
 * org.springframework.util.StringUtils 를 Wrapping 한 클래스이며, 
 * StringUtils에서 제공하지 않는 자주사용하는 메소드를 추가한 클래스입니다.
 * </p>
 * 
 * @see org.springframework.util.StringUtils
 * 
 */
public abstract class StringUtils extends org.springframework.util.StringUtils {
	/**
	 * 대상 문자열과 주어진 패턴의 매칭 여부를 리턴한다.
	 * 
	 * @param s
	 *            검사 대상 문자열
	 * @param pattern
	 *            패턴 Regular Expression
	 * @return 패턴과 매칭 될 경우 true
	 */
	public static boolean matches(String s, String pattern) {
		if (!hasText(s) || !hasText(pattern)) {
			return false;
		}// end if
		return Pattern.compile(pattern).matcher(s).matches();
	}// end of matches()

	/**
	 * 대상 문자열이 주어진 패턴을 포함하고 있는지의 여부를 리턴합니다.
	 * 
	 * @param s
	 *            포함 검사 대상 문자열
	 * @param pattern
	 *            패턴 Regular Expression
	 * @return 패턴을 포함하고 있을 경우 true
	 */
	public static boolean contains(String s, String pattern) {
		if (!hasText(s) || !hasText(pattern)) {
			return false;
		}// end if
		return Pattern.compile(pattern).matcher(s).find();
	}// end of contains()

	/**
	 * 대상 문자열이 대소문자 구별없이 주어진 패턴을 포함하고 있는지의 여부를 리턴합니다.
	 * 
	 * @param s
	 *            포함 검사 대상 문자열
	 * @param pattern
	 *            패턴 Regular Expression
	 * @return 패턴을 포함하고 있을 경우 true
	 */
	public static boolean containsCaseInsensitive(String s, String pattern) {
		if (!hasText(s) || !hasText(pattern)) {
			return false;
		}// end if
		return Pattern.compile(pattern, Pattern.CASE_INSENSITIVE).matcher(s).find();
	}// end of containsCaseInsensitive()

	/**
	 * 대상 문자열에 숫자가 포함되어 있는지를 검사한다. 숫자가 한글자라도 포함되어 있으면 true를 리턴
	 * 
	 * @param s
	 *            검사대상 문자열
	 * @return 숫자가 포함되어 있을경우 true
	 */
	public static boolean containsNumber(String s) {
		return contains(s, "[0-9]");
	}// end of containsNumber()

	/**
	 * 대상 문자열에 알파벳이 포함되어 있는지를 검사한다. 알파벳이 한글자라도 포함되어 있으면 true를 리턴
	 * 
	 * @param s
	 *            검사대상 문자열
	 * @return 알파벳이 포함되어 있을경우 true
	 */
	public static boolean containsAlphabet(String s) {
		return contains(s, "[a-zA-Z]");
	}// end of containsAlphabet()

	/**
	 * 대상 문자열에 알파벳 대문자가 포함되어 있는지를 검사한다. 알파벳 대문자가 한글자라도 포함되어 있으면 true 를 리턴
	 * 
	 * @param s
	 *            검사대상 문자열
	 * @return 알파벳 대문자가 포함되어 있을경우 true
	 */
	public static boolean containsUpperCase(String s) {
		return contains(s, "[A-Z]");
	}// end of containsCapital()

	/**
	 * 대상 문자열에 알파벳 소문자가 포함되어 있는지를 검사한다. 알파벳 소문자가 한글자라도 포함되어 있으면 true 를 리턴
	 * 
	 * @param s
	 *            검사대상 문자열
	 * @return 알파벳 소문자가 포함되어 있을경우 true
	 */
	public static boolean containsLowerCase(String s) {
		return contains(s, "[a-z]");
	}// end of containsSmall()

	/**
	 * 대상 문자열에 한글이 포함되어 있는지를 검사한다. 한글이 한글자라도 포함되어 있으면 true를 리턴
	 * 
	 * @param s
	 *            검사대상 문자열
	 * @return 한글이 포함되어 있을경우 true
	 */
	public static boolean containsKorean(String s) {
		return contains(s, "[ㄱ-ㅎㅏ-ㅣ가-힣]");
	}// end of containsKorean()

	/**
	 * 대상 문자열이 알파벳인지 아닌지를 판단한다. (대소문자 구분 없음)
	 * 
	 * @param s
	 *            검사 대상 문자열
	 * @return 알파벳일 경우 true
	 */
	public static boolean isAlphabet(String s) {
		return matches(s, "[a-zA-Z]*");
	}// end of isAlphabet()

	/**
	 * 주어진 문자열이 알파벳 대문자인지 확인한다. 문자열에 포함된 모든 문자가 알파벳 대문자여야만 true를 리턴한다.
	 * 
	 * @param s
	 *            검사 대상 문자열
	 * @return 알파벳 대문자 일 경우 true
	 */
	public static boolean isUpperCase(String s) {
		return matches(s, "[A-Z]*");
	}// end of isCapital()

	/**
	 * 주어진 문자열이 알파벳 소문자인지 확인한다. 문자열에 포함된 모든 문자가 알파벳 소문자여야만 true를 리턴한다.
	 * 
	 * @param s
	 *            검사 대상 문자열
	 * @return 알파벳 소문자 일 경우 true
	 */
	public static boolean isLowerCase(String s) {
		return matches(s, "[a-z]*");
	}// end of isSmall()

	/**
	 * 대상 문자열이 한글인지 아닌지를 판단한다.
	 * 
	 * @param s
	 *            검사 대상 문자열
	 * @return 한글일 경우 true
	 */
	public static boolean isKorean(String s) {
		return matches(s, "[ㄱ-ㅎㅏ-ㅣ가-힣]*");
	}// end of isKorean()

	/**
	 * 대상 문자열이 알파벳 혹은 숫자로 이루어져 있는지 검사한다.
	 * 
	 * @param s
	 *            검사대상 문자열
	 * @return 알파벳 혹은 숫자로 되어있을 경우 true
	 */
	public static boolean isAlphaNumeric(String s) {
		return matches(s, "[\\s\\w]*");
	}// end of isAlphaNumeric()

	/**
	 * 대상 문자열이 알파벳과 숫자로만 (항상 둘의 조합, 영숫자 혼용) 이루어져 있는지 검사한다.
	 * 
	 * @param s
	 *            검사대상 문자열
	 * @return 알파벳과 숫자로만 이루어져 있을 경우 true
	 */
	public static boolean isMixedAlphaNumeric(String s) {
		if (containsNumber(s) && containsAlphabet(s)) {
			return true;
		} else {
			return false;
		}// end if else
	}// end of isMixedAlphaNumeric()
	
	/**
	 * 주어진 문자를 주어진 패턴으로 나누어서 camel-case 형태의 문자열로 변환합니다.
	 * 
	 * @param s
	 *            camel-case로 변환할 대상 문자열
	 * @param splitPattern
	 *            camel-case로 변환하기 위해 사용할 단어 구분 패턴
	 * @return camel-case로 변환된 문자열
	 */
	public static String camelize(String s, String delim) {
		if(s == null || "".equals(s.trim())) {
			return s;
		}
		
		char cDelim = (delim == null || "".equals(delim.trim())) ? '_' : delim.charAt(0);		
		StringBuilder sb = new StringBuilder(25);
		boolean toGoCapital = false;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == cDelim) {
				if(i > 0) {
					toGoCapital = true;
				}
				continue;
			}
			if(toGoCapital) {
				if(Character.isLowerCase(ch)) {
					ch = Character.toUpperCase(ch);
				}
				toGoCapital = false;
			} else {
				if(Character.isUpperCase(ch)) {
					ch = Character.toLowerCase(ch);
				}
			}
			sb.append(ch);
		}
		
		return sb.toString();

	}
// Camelize 성능 향상을 위해 로직 변경 2015.07.28 이태훈
//	public static String camelize(String s, String splitPattern) {
//		if (!hasText(s)) {
//			return s;
//		}// end if
//		
//		String[] parts = s.split(splitPattern);
//		if (parts.length == 1) {			
//			return parts[0].toLowerCase();	
//		}// end if
//
//		StringBuffer camelized = new StringBuffer();
//
//		for (int i = 0; i < parts.length; i++) {
//			if (!StringUtils.hasText(parts[i])) {
//				continue;
//			}// end if
//			camelized.append(Character.toUpperCase(parts[i].charAt(0)));
//			camelized.append(parts[i].substring(1).toLowerCase());
//		}// end for
//
//		camelized.setCharAt(0, Character.toLowerCase(camelized.charAt(0)));
//
//		return camelized.toString();
//	}


	
	/**
	 * 주어진 문자를 문자열이 '_'로 구분되어 있을 경우에 대해 camel-case 형태의 문자열로 변환합니다.
	 * 
	 * @param s
	 *            camel-case로 변환할 대상 문자열
	 * @return camel-case로 변환된 문자열
	 */
	public static String camelize(String s) {
		return camelize(s, "_");
	}

	/**
	 * 주어진 camel-case 형태의 문자열을 주어진 패턴으로 구분된 문자열로 변환하여 리턴합니다.
	 * 
	 * @param s
	 *            camel-case 형태의 문자열
	 * @param splitPattern
	 *            문자열 구분 패턴
	 * @param toUpperCase
	 *            대문자화 여부
	 * @return 변환된 결과 문자열
	 */
	public static String decamelize(String s, String splitPattern, boolean toUpperCase) {
		if (!hasText(s)) {
			return s;
		}

		StringBuffer decamelized = new StringBuffer();

		if (toUpperCase) {
			decamelized.append(Character.toUpperCase(s.charAt(0)));
		} else {
			decamelized.append(Character.toLowerCase(s.charAt(0)));
		}// end if else

		for (int i = 1, length = s.length(); i < length; i++) {
			char c = s.charAt(i);
			if (i != 0 && Character.isUpperCase(c)) {
				decamelized.append(splitPattern);
			}// end if
			if (toUpperCase) {
				decamelized.append(Character.toUpperCase(c));
			} else {
				decamelized.append(Character.toLowerCase(c));
			}// end if else
		}// end for

		return decamelized.toString();
	}// end of decamelize()
	
	/**
	 * 주어진 camel-case 형태의 문자열을 주어진 패턴으로 구분된 문자열로 변환하여 리턴합니다.
	 * 단.처음으로 나오는 숫자의 경우에도 구분된 문자열로 변한다.
	 * ex) userId123  ==> USER_ID_123 
	 * 
	 * @param s
	 *            camel-case 형태의 문자열
	 * @param splitPattern
	 *            문자열 구분 패턴
	 * @param toUpperCase
	 *            대문자화 여부
	 * @return 변환된 결과 문자열
	 */
	public static String decamelizeIncludeNumeric(String s, String splitPattern, boolean toUpperCase) {
		if (!hasText(s)) {
			return s;
		}

		StringBuffer decamelized = new StringBuffer();

		if (toUpperCase) {
			decamelized.append(Character.toUpperCase(s.charAt(0)));
		} else {
			decamelized.append(Character.toLowerCase(s.charAt(0)));
		}// end if else

		for (int i = 1, length = s.length(); i < length; i++) {
			char c = s.charAt(i);
			if (i != 0 && Character.isUpperCase(c)) {
				decamelized.append(splitPattern);
			}// end if
			if (i != 0 && Character.isDigit(c)) {
				char prev_c = s.charAt(i-1);
				if(!Character.isDigit(prev_c) && !Character.isUpperCase(prev_c)) {
					if(i+1 < length) {
						char next_c = s.charAt(i+1);
						if(!Character.isUpperCase(next_c)) {
							decamelized.append(splitPattern);
						}						
					}
					else {
						decamelized.append(splitPattern);
					}
				}
			}
			if (toUpperCase) {
				decamelized.append(Character.toUpperCase(c));
			} else {
				decamelized.append(Character.toLowerCase(c));
			}// end if else
		}// end for

		return decamelized.toString();
	}// end of decamelize()	

	/**
	 * 주어진 camel-case 형태의 문자열을 '_'로 구분된 대문자 형태의 문자열로 변환합니다.
	 * 
	 * @param s
	 *            변환할 대상 문자열
	 * @return 변환된 문자열
	 */
	public static String decamelize(String s) {
		return decamelize(s, "_", true);
	}// end of decamelize()
	
	/**
	 * 주어진 문자열의 길이(getBytes() 결과 길이)가 주어진 크기보다 작으면 padding char 를 부족한 길이만큼 왼쪽에
	 * 추가합니다.<BR>
	 * 단, 주어진 문자열의 길이가 주어진 크기보다 클 경우, 문자열의 맨 앞 부분부터 주어진 길이만큼만 잘려진 문자열이 리턴됩니다.<BR>
	 * <BR>
	 * 
	 * 사용예) leftPadding("A", 3, '0')<BR>
	 * 결 과 ) "00A"<BR>
	 * <BR>
	 * 사용예) leftPadding("ABCD", 3, '0')<BR>
	 * 결 과 ) "ABC"<BR>
	 * <BR>
	 * 
	 * @param src
	 *            padding 하기 위한 문자열
	 * @param size
	 *            padding 하기 위한 길이
	 * @param paddingChar
	 *            padding 할 문자
	 * @return padding 이 완료된 문자열
	 */
	public static String leftPadding(String src, int size, char paddingChar) {
        // 성능 개선을 위하여, 아래와 같은 공통 호출과 관련된 부분을,
        // 동일하게 복사하였음.

        int srcLength = 0;
        byte [] srcBytes;
        if (src == null) {
    		StringBuffer result = new StringBuffer();
            for (int i = 0; i < size; i++) {
                result.append(paddingChar);
            }//end for
            return result.toString();
        } else {
            srcBytes = src.getBytes();
            srcLength = srcBytes.length;
        }//end if else
        if (size == srcLength) {
            return src;
        } else if (size < srcLength) {
            return new String(srcBytes, 0, size);
        }//end if else
        int paddingCount = size - srcLength;
		StringBuffer result = new StringBuffer();
        for (int i = 0; i < paddingCount; i++) {
            result.append(paddingChar);
        }//end for
        result.append(src);
        return result.toString();
	}// end of leftPadding()

	/**
	 * 주어진 문자열의 길이(getBytes() 결과 길이)가 주어진 크기보다 작으면 padding char 를 부족한 길이만큼 오른쪽에
	 * 추가합니다.<BR>
	 * <BR>
	 * 
	 * 사용예) rightPadding("A", 3, '0')<BR>
	 * 결 과 ) "A00"<BR>
	 * <BR>
	 * 사용예) rightPadding("ABCD", 3, '0')<BR>
	 * 결 과 ) "ABC"<BR>
	 * <BR>
	 * 
	 * @param src
	 *            padding 하기 위한 문자열
	 * @param size
	 *            padding 하기 위한 길이
	 * @param paddingChar
	 *            padding 할 문자
	 * @return padding 이 완료된 문자열
	 */
	public static String rightPadding(String src, int size, char paddingChar) {
        // 성능 개선을 위하여, 아래와 같은 공통 호출과 관련된 부분을,
        // 동일하게 복사하였음.

        int srcLength = 0;
        byte [] srcBytes;
        if (src == null) {
    		StringBuffer result = new StringBuffer();
            for (int i = 0; i < size; i++) {
                result.append(paddingChar);
            }//end for
            return result.toString();
        } else {
            srcBytes = src.getBytes();
            srcLength = srcBytes.length;
        }//end if else
        if (size == srcLength) {
            return src;
        } else if (size < srcLength) {
            return new String(srcBytes, 0, size);
        }//end if else
        int paddingCount = size - srcLength;
		StringBuffer result = new StringBuffer(src);
        for (int i = 0; i < paddingCount; i++) {
            result.append(paddingChar);
        }//end for
        return result.toString();
	}// end of rightPadding()
	
	/**
	 * 문자열에 포함되어 있는 공백문자를 제거한 문자열을 리턴합니다.
	 * 
	 * 공백문자에는 space, CR/LF, tab-space 등이 포함됩니다.
	 * 
	 * @param src
	 *            대상 문자열
	 * @return 공백문자를 제거한 문자열
	 */
	public static String normalizeWhiteSpace(String src) {
		if (src == null) {
			return null;
		}
		return src.replaceAll("\\s", "");
	}// end of normalizeWhiteSpace()	
	
	/**
	 * camel case 형식의 프로퍼티 명을 컬럼 이름으로 변환해준다. 
	 * 다만, 숫자 형식의 문자는 변환 대상에서 제외한다.
	 * 예) userId => user_id
	 * 예) user1 => user_1
	 * 예) user123 => user_123
	 *
	 * @param name
	 * @return
	 */
	public static String convertUnderScore(String name) {
		StringBuffer result = new StringBuffer();
		if (name != null && name.length() > 0) {
			result.append(name.substring(0, 1).toLowerCase());
			boolean firstDigit = true;

			for (int i = 1; i < name.length(); i++) {
				String s = name.substring(i, i + 1);

				// 대문자 A-Z까지만 변환 대상
				if (Pattern.compile("[A-Z]").matcher(s).find()) {
					result.append("_");
					result.append(s.toLowerCase());
				} else if (Pattern.compile("[0-9]").matcher(s).find() && firstDigit == true) {
					// 첫 번째 숫자가 나왔을 때만 '_'를 추가
					firstDigit = false;
					result.append("_");
					result.append(s.toLowerCase());
				} else {
					result.append(s);
				}
			}
		}
		return result.toString();
	}		
	
	public static String join(Object[] array, char separator) {
		if (array == null) {
			return null;
		}

		return join(array, separator, 0, array.length);
	}

	public static String join(Object[] array, char separator, int startIndex,
			int endIndex) {
		if (array == null) {
			return null;
		}
		int bufSize = endIndex - startIndex;
		if (bufSize <= 0) {
			return "";
		}

		bufSize *= (((array[startIndex] == null) ? 16 : array[startIndex]
				.toString().length()) + 1);
		StringBuffer buf = new StringBuffer(bufSize);

		for (int i = startIndex; i < endIndex; ++i) {
			if (i > startIndex) {
				buf.append(separator);
			}
			if (array[i] != null) {
				buf.append(array[i]);
			}
		}
		return buf.toString();
	}

	public static String join(Object[] array, String separator) {
		if (array == null) {
			return null;
		}
		return join(array, separator, 0, array.length);
	}

	public static String join(Object[] array, String separator, int startIndex,
			int endIndex) {
		if (array == null) {
			return null;
		}
		if (separator == null) {
			separator = "";
		}

		int bufSize = endIndex - startIndex;
		if (bufSize <= 0) {
			return "";
		}

		bufSize *= (((array[startIndex] == null) ? 16 : array[startIndex]
				.toString().length()) + separator.length());

		StringBuffer buf = new StringBuffer(bufSize);

		for (int i = startIndex; i < endIndex; ++i) {
			if (i > startIndex) {
				buf.append(separator);
			}
			if (array[i] != null) {
				buf.append(array[i]);
			}
		}
		return buf.toString();
	}

	public static String join(Iterator iterator, char separator) {
		if (iterator == null) {
			return null;
		}
		if (!(iterator.hasNext())) {
			return "";
		}
		Object first = iterator.next();
		if (!(iterator.hasNext())) {
			return first==null?"":first.toString();
		}

		StringBuffer buf = new StringBuffer(256);
		if (first != null) {
			buf.append(first);
		}

		while (iterator.hasNext()) {
			buf.append(separator);
			Object obj = iterator.next();
			if (obj != null) {
				buf.append(obj);
			}
		}

		return buf.toString();
	}

	public static String join(Iterator iterator, String separator) {
		if (iterator == null) {
			return null;
		}
		if (!(iterator.hasNext())) {
			return "";
		}
		Object first = iterator.next();
		if (!(iterator.hasNext())) {
			return first==null?"":first.toString();
		}

		StringBuffer buf = new StringBuffer(256);
		if (first != null) {
			buf.append(first);
		}

		while (iterator.hasNext()) {
			if (separator != null) {
				buf.append(separator);
			}
			Object obj = iterator.next();
			if (obj != null) {
				buf.append(obj);
			}
		}
		return buf.toString();
	}

	public static String join(Collection collection, char separator) {
		if (collection == null) {
			return null;
		}
		return join(collection.iterator(), separator);
	}

	public static String join(Collection collection, String separator) {
		if (collection == null) {
			return null;
		}
		return join(collection.iterator(), separator);
	}	
}
