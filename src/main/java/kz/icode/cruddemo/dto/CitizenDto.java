package kz.icode.cruddemo.dto;

import java.sql.Date;

import javax.persistence.Column;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Тело запроса на создание гражданина")
public class CitizenDto {
	
	@ApiModelProperty("Фамилия")
	private String surname;

	@ApiModelProperty("Имя")
	private String name;

	@ApiModelProperty("Отчество")
	private String patronymic;

	@ApiModelProperty("Дата рождения")
	private Date birthdate;
//
//	@Column(name = "sex")
//	private String sex;
//
//	@Column(name = "location")
//	private String location;
//
//	@Column(name = "identity_document_number")
//	private String identityDocumentNumber;
//
//	@Column(name = "identity_document_type")
//	private String identityDocumentType;
//
//	@Column(name = "identity_document_issuing_authority")
//	private String identityDocumentIssuingAuthority;
//
//	@Column(name = "date_of_issue_identity_document")
//	private Date dateOfIssueIdentityDocument;
//
//	@Column(name = "expiration_date_identity_document")
//	private Date expirationDateIdentityDocument;

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
}



