package ru.yandex.practicum.contacts.model;

public class ContactType {

    public static final String TELEGRAM = "telegram";
    public static final String WHATS_APP = "whats_app";
    public static final String VIBER = "viber";
    public static final String SIGNAL = "signal";
    public static final String THREEMA = "threema";
    public static final String PHONE = "phone";
    public static final String EMAIL = "email";

    public static String[] getContactTypes() {
        return new String[]{ContactType.TELEGRAM, ContactType.WHATS_APP, ContactType.VIBER, ContactType.SIGNAL, ContactType.THREEMA, ContactType.PHONE, ContactType.EMAIL};
        // метод должен возвращать массив строк, перечисленных выше
    }
}
