package ru.stqa.pft.addressbook.model;

public class ContactFieldsData {
    private final String contactFirstname;
    private final String contactMiddlename;
    private final String contactLastname;
    private final String contactNickname;
    private final String contactTitle;
    private final String contactCompany;
    private final String contactAddress;
    private final String contactHome;
    private final String contactMobile;
    private final String contactWork;
    private final String contactFax;
    private final String contactEmail;
    private final String contactEmail2;
    private final String contactEmail3;
    private final String contactHomepage;
    private final String contactBday;
    private final String contactBmonth;
    private final String contactAday;
    private final String contactAmonth;
    private final String contactByear;
    private final String contactAyear;
    private final String contactAddress2;
    private final String contactPhone2;
    private final String contactNotes;
    private final String contactGroup;

    public ContactFieldsData(String contactFirstname, String contactMiddlename, String contactLastname,
                             String contactNickname, String contactTitle, String contactCompany,
                             String contactAddress, String contactHome, String contactMobile, String contactWork,
                             String contactFax, String contactEmail, String contactEmail2, String contactEmail3,
                             String contactHomepage,String contactBday,String contactBmonth,
                             String contactByear,String contactAday,String contactAmonth, String contactAyear,
                             String contactAddress2,String contactGroup, String contactPhone2, String contactNotes ) {
        this.contactFirstname = contactFirstname;
        this.contactMiddlename = contactMiddlename;
        this.contactLastname = contactLastname;
        this.contactNickname = contactNickname;
        this.contactTitle = contactTitle;
        this.contactCompany = contactCompany;
        this.contactAddress = contactAddress;
        this.contactHome = contactHome;
        this.contactMobile = contactMobile;
        this.contactWork = contactWork;
        this.contactFax = contactFax;
        this.contactEmail = contactEmail;
        this.contactEmail2 = contactEmail2;
        this.contactEmail3 = contactEmail3;
        this.contactHomepage = contactHomepage;
        this.contactBday = contactBday;
        this.contactBmonth = contactBmonth;
        this.contactByear = contactByear;
        this.contactAday = contactAday;
        this.contactAmonth = contactAmonth;
        this.contactAyear = contactAyear;
        this.contactAddress2 = contactAddress2;
        this.contactPhone2 = contactPhone2;
        this.contactNotes = contactNotes;
        this.contactGroup = contactGroup;
    }

    public String getContactFirstname() {
        return contactFirstname;
    }

    public String getContactMiddlename() {
        return contactMiddlename;
    }

    public String getContactLastname() {
        return contactLastname;
    }

    public String getContactNickname() {
        return contactNickname;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public String getContactCompany() {
        return contactCompany;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getContactHome() {
        return contactHome;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public String getContactWork() {
        return contactWork;
    }

    public String getContactFax() {
        return contactFax;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactEmail2() {
        return contactEmail2;
    }

    public String getContactEmail3() {
        return contactEmail3;
    }

    public String getContactHomepage() {
        return contactHomepage;
    }

    public String getContactBday() {
        return contactBday;
    }
    public String getContactBmonth() {
        return contactBmonth;
    }

    public String getContactByear() {
        return contactByear;
    }

    public String getContactAday() {
        return contactAday;
    }
    public String getContactAmonth() {
        return contactAmonth;
    }

    public String getContactAyear() {
        return contactAyear;
    }

    public String getContactAddress2() {
        return contactAddress2;
    }

    public String getContactPhone2() {
        return contactPhone2;
    }

    public String getContactNotes() {
        return contactNotes;
    }

    public String getContactGroup() {
        return contactGroup;
    }

}
