package lesson48_6;

public enum Animal {
    DOG("������"), CAT("�����"), FROG("�������");

    private String translation;

    Animal(String translation) { //�����������
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "������� �� ������� ����: " + translation;
    }
}
