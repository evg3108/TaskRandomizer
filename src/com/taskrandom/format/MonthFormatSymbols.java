package com.taskrandom.format;

import java.text.DateFormatSymbols;

public class MonthFormatSymbols extends DateFormatSymbols{

        @Override
        public String[] getMonths() {
            return new String[]{"января", "февраля", "марта", "апреля", "мая", "июня",
                    "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        }

}
