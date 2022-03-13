package kz.icode.cruddemo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "citizen")
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "surname")
	private String surname;

	@Column(name = "name")
	private String name;

	@Column(name = "patronymic")
	private String patronymic;

	@Column(name = "birthdate")
	private Date birthdate;

	@Column(name = "sex")
	private String sex;

	@Column(name = "location")
	private String location;

	@Column(name = "identity_document_number")
	private String identityDocumentNumber;

	@Column(name = "identity_document_type")
	private String identityDocumentType;

	@Column(name = "identity_document_issuing_authority")
	private String identityDocumentIssuingAuthority;

	@Column(name = "date_of_issue_identity_document")
	private Date dateOfIssueIdentityDocument;

	@Column(name = "expiration_date_identity_document")
	private Date expirationDateIdentityDocument;

	public Citizen() {

	}

	public Citizen(String surname, String name, String patronymic, Date birthdate, String sex, String location,
			String identityDocumentNumber, String identityDocumentType, String identityDocumentIssuingAuthority,
			Date dateOfIssueIdentityDocument, Date expirationDateIdentityDocument) {
		super();
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.birthdate = birthdate;
		this.sex = sex;
		this.location = location;
		this.identityDocumentNumber = identityDocumentNumber;
		this.identityDocumentType = identityDocumentType;
		this.identityDocumentIssuingAuthority = identityDocumentIssuingAuthority;
		this.dateOfIssueIdentityDocument = dateOfIssueIdentityDocument;
		this.expirationDateIdentityDocument = expirationDateIdentityDocument;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIdentityDocumentNumber() {
		return identityDocumentNumber;
	}

	public void setIdentityDocumentNumber(String identityDocumentNumber) {
		this.identityDocumentNumber = identityDocumentNumber;
	}

	public String getIdentityDocumentType() {
		return identityDocumentType;
	}

	public void setIdentityDocumentType(String identityDocumentType) {
		this.identityDocumentType = identityDocumentType;
	}

	public String getIdentityDocumentIssuingAuthority() {
		return identityDocumentIssuingAuthority;
	}

	public void setIdentityDocumentIssuingAuthority(String identityDocumentIssuingAuthority) {
		this.identityDocumentIssuingAuthority = identityDocumentIssuingAuthority;
	}

	public Date getDateOfIssueIdentityDocument() {
		return dateOfIssueIdentityDocument;
	}

	public void setDateOfIssueIdentityDocument(Date dateOfIssueIdentityDocument) {
		this.dateOfIssueIdentityDocument = dateOfIssueIdentityDocument;
	}

	public Date getExpirationDateIdentityDocument() {
		return expirationDateIdentityDocument;
	}

	public void setExpirationDateIdentityDocument(Date expirationDateIdentityDocument) {
		this.expirationDateIdentityDocument = expirationDateIdentityDocument;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", birthdate=" + birthdate + ", sex=" + sex + ", location=" + location + ", identityDocumentNumber="
				+ identityDocumentNumber + ", identityDocumentType=" + identityDocumentType
				+ ", identityDocumentIssuingAuthority=" + identityDocumentIssuingAuthority
				+ ", dateOfIssueIdentityDocument=" + dateOfIssueIdentityDocument + ", expirationDateIdentityDocument="
				+ expirationDateIdentityDocument + "]";
	}
}
