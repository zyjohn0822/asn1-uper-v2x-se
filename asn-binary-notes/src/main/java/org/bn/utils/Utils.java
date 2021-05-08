package org.bn.utils;

/**
 * @author zhangyong
 * @date 2020/12/12  16:09
 */
public class Utils {
    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static int DIVISION_TWO = 2;

    /**
     * ��������: <br>
     * <p>��16�����ַ���ת����byte[]����</p>
     * �޸�����: <br>
     * <p>�޸���:</p>
     * <p>�޸�ԭ��:</p>
     *
     * @param s 16�����ַ���
     * @return: byte[] byte[]����
     * @since: 1.0.0
     * @Author: zhangyong
     * @Date: 2020/10/30 14:02
     */
    public static byte[] bytesFromHexString(String s) {
        if ((s.length() % 2) != 0) {
            throw new IllegalArgumentException(
                    "Converting to bytes requires even number of characters, got " + s.length());
        }
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

    /**
     * ��������: <br>
     * <p>��byte[]ת��Ϊ16�����ַ���</p >
     * �޸�����: <br>
     * <p>�޸���:</p >
     * <p>�޸�ԭ��:</p >
     *
     * @param bytes byte[]
     * @return: java.lang.String
     * @since: 1.0.0
     * @Author: zhangyong
     * @Date: 2020/10/30 14:00
     */
    public static String hexStringFromBytes(byte[] bytes) {

        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static String hexLowerSort(String hexHeight) throws Exception {
        if (hexHeight.length() % DIVISION_TWO != 0) {
            throw new Exception("���Ȳ�Ϊż��");
        }
        StringBuilder hexBuilder = new StringBuilder();
        for (int i = 8; i > 0; i--) {
            int begin = i * 2;
            hexBuilder.append(hexHeight, begin - 2, begin);
        }
        return hexBuilder.toString();
    }
}
