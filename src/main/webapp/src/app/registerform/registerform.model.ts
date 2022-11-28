export class RegisterForm {

    public companyName: string;
    public founderName: string;
    public industry: string;
    public primaryService: string;
    public secondaryService: string;
    public address: string;
    public companyEmail: string;
    public companyPhoneNumber: string;

    public contactName: string;
    public contactTitle: string;
    public contactEmail: string;
    public contactPhoneNumber: string;

    public numberOfUsers: number;
    public revenue: string;
    public tokenType: string;
    public useOfService: string;
    public devSupport: boolean;
    public devSupportDesc: string;
    public newToken: boolean;
    public newTokenDesc: string;
    public smartContract: boolean;
    public smartContractDesc: string;

    public survey: string;
    public referral: string;


    constructor(
        companyName: string,
        founderName: string,
        industry: string,
        primaryService: string,
        secondaryService: string,
        address: string,
        companyEmail: string,
        companyPhoneNumber: string,
        contactName: string,
        contactTitle: string,
        contactEmail: string,
        contactPhoneNumber: string,
        numberOfUsers: number,
        revenue: string,
        tokenType: string,
        useOfService: string,
        devSupport: boolean,
        devSupportDesc: string,
        newToken: boolean,
        newTokenDesc: string,
        smartContract: boolean,
        smartContractDesc: string,
        survey: string,
        referral: string
    ) {
        this.companyName = companyName
        this.founderName = founderName
        this.industry = industry
        this.primaryService = primaryService
        this.secondaryService = secondaryService
        this.address = address
        this.companyEmail = companyEmail
        this.companyPhoneNumber = companyPhoneNumber
        this.contactName = contactName
        this.contactTitle = contactTitle
        this.contactEmail = contactEmail
        this.contactPhoneNumber = contactPhoneNumber
        this.numberOfUsers = numberOfUsers
        this.revenue = revenue
        this.tokenType = tokenType
        this.useOfService = useOfService
        this.devSupport = devSupport
        this.devSupportDesc = devSupportDesc
        this.newToken = newToken
        this.newTokenDesc = newTokenDesc
        this.smartContract = smartContract
        this.smartContractDesc = smartContractDesc
        this.survey = survey
        this.referral = referral
    }
}