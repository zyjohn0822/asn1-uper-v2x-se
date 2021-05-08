package com.hisense.hiatmp.asn.common;

/**
 * @author zhangyong
 * @date 2020/12/22  10:20
 */
public class Utils {
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
    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();

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

    public static String hexStringFromBytes(byte[] bytes) {

        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
