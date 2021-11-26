/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo_11;
/**
 *
 * @author Admin
 */
public class Start {
      /* текст из файла */
      String text;
      /**
       * метод начала работы
       */
        public void Run()
        {
            // читаем файл и получем из него текст кода
            Reader reader = new Reader();
            text = reader.textCode("java.txt");   
            ParserLexeme lexeme = new ParserLexeme(text);
            lexeme.readLexeme();
            // создаем класс и получаем объектный код 
            Compiller result = new Compiller();
            result.compileObjectCode();
        }
}
