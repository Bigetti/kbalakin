package ru.job4j.loop;

public class Paint {
    /**Метод класса, рисующий пирамиду.
     * @param h - высота пирамиды.
     * @return result - возвращаемое строковое представление пирамиды.
     */
    public String pyramid(int h) {
/**Объект класса StringBuilder.
 * Используется для построения строкового представления пирамиды.
 */
        StringBuilder result = new StringBuilder("");/**Цикл for.
         * Цикл для создания пирамиды.
         */
        for (int i = 0; i <= h + 2; i += 2) {
            for (int j = 0; j < 5 - i; j += 2) {
                result.append(" ");
            }
            for (int k = 0; k <= i; k++) {
                result.append("^");
            }
            /**Метод перехода на новую строку.
             * Используется после формирования очередной строки.
             */
            result.append(System.getProperty("line.separator"));
        }
        return result.toString();
    }
}