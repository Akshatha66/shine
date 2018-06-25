package pom;

//import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Autoconstans;
import generic.BasePage;
import generic.Slctcls;

public class ProfilePage {
	
	
	@FindBy(xpath="//span[@class='edit']")
	private WebElement edit;
	
	@FindBy(id="id_name")
	private WebElement nme;
	
	@FindBy(id="id_email")
	private WebElement mail;
	
	@FindBy(id="id_cell_phone")
	private WebElement phone;
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	private WebElement submitbtn;
	
	@FindBy(id="id_date_of_birth")
	private WebElement dobbtn;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement year;
	
	@FindBy(xpath="//a[.='10']")
	private WebElement date;
	
	@FindBy(id="id_candidate_location")
	private WebElement citybttn;
	
	@FindBy(xpath="//select[@id='selectCountry']")
	private WebElement world;
	
	@FindBy(id="id_gender_1")
	private WebElement genderbttn;
	
	@FindBy(xpath="(//span[@class='edit'])[3]")
	private WebElement editebttn;
	
	@FindBy(name="institute_name")
	private WebElement addinstbttn;
	
	@FindBy(name="year_of_passout")
	private WebElement yopbttn;
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	private WebElement submitbttn;
	
	@FindBy(id="id_add_new_skill")
	private WebElement addskilbttn;
	
	@FindBy(xpath="//input[@id='id_value']")
	private WebElement skilltb;
	
	@FindBy(id="id_years_of_experience")
	private WebElement selexp;
	
	@FindBy(xpath="//input[@class='submitred']")
	private WebElement saveexpbtn;
	
	@FindBy(xpath="(//span[@class='cls_editreg3_delete_skill cross'])[3]")
	private WebElement rmvskillbtn;
	
	@FindBy(id="id_cpSubmit")
	private WebElement yesbttn;
	
	@FindBy(id="id_add_new_certification")
	private WebElement addcertbttn;
	
	@FindBy(id="id_certification_name")
	private WebElement certinamebtn;
	
	@FindBy(id="id_certification_year")
	private WebElement cyearbttn;
	
	@FindBy(xpath="//a[.='Upload new resume']")
	private WebElement upldresbttn;
	
	@FindBy(xpath="(//input[@id='id_file'])[1]")
	private WebElement browsebttn;
	
	@FindBy(xpath="//input[@class='submitred resumeupload']")
	private WebElement uploadbtn;
	
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void editbttn()
			{
	
		edit.click();
		
	}
	public void addname(String name)
	{
		nme.sendKeys(name);
	}
	public void addemail(String email)
	{
		mail.sendKeys(email);
	}
	public void addphone(String phonenum) {
	
		phone.sendKeys(phonenum);
	}
	public void DOB()
	{
		dobbtn.click();
	}
	public void Month(String mnth)
	{
		
		Autoconstans a=new Autoconstans();
		a.select(month, mnth);
	}
	public void Year(String Yr)
	{
		Autoconstans a=new Autoconstans();
		a.select(year, Yr);
	}
	public void Date()
	{
		date.click();
	}
	public void World(String wrld,WebDriver driver)
	{
		BasePage.elementPresent(world, driver);
		Autoconstans a=new Autoconstans();
		a.select(world, wrld);
	}
	public void City(String cty)
	{
		Autoconstans a=new Autoconstans();
		a.select(citybttn, cty);
	}
	
		public void gender()
		{
			genderbttn.click();
		}
	public void submit()
	{

		submitbtn.click();
		
	}
	public void clickedit()
	{
		editebttn.click();
	}
	public void editedu()
	{
		editebttn.click();
	}
	public void addcollege(String institute)
	{
		addinstbttn.sendKeys(institute);
	}
	public void addyopsubmit(String poy)
	{
		Slctcls s=new Slctcls();
		s.select(yopbttn, poy);
		
	}
	public void submitedu()
	{
		submitbttn.click();
	}
	public void addskill()
	{
		addskilbttn.click();
	}
	public void skill(String skill)
	{
		skilltb.sendKeys(skill);
	}
	public void selectexp(String expyrs)
	{
		Slctcls s=new Slctcls();
		s.select(selexp, expyrs);
	}
	public void saveexp()
	{
		saveexpbtn.click();
	}
	public void removeskill()
	{
		rmvskillbtn.click();
	}
	public void removeyes()
	{
		yesbttn.click();
	}
	public void addnewcert()
	{
		addcertbttn.click();
	}
	public void certname(String cname)
	{
		certinamebtn.sendKeys(cname);
	}
	public void certyear()
	{
		Slctcls s=new Slctcls();
		s.select(cyearbttn,"2017" );
	}
	public void newresbutton()
	{
		upldresbttn.click();
		
	}
	public void browse(String res)
	{
		browsebttn.sendKeys(res);
	}
	public void upldbutton()
	{
		uploadbtn.click();
	}
	
	
	
}
