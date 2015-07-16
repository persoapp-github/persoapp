package iso.std.iso_iec._24727.tech.schema;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.6 in JDK 6 Generated source version: 2.0
 * 
 */
@WebService(name = "SAL", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SAL {

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "Initialize", action = "urn:iso:std:iso-iec:24727:tech:schema:Initialize")
	@WebResult(name = "InitializeResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType initialize(
			@WebParam(name = "Initialize", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") RequestType parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "Terminate", action = "urn:iso:std:iso-iec:24727:tech:schema:Terminate")
	@WebResult(name = "TerminateResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType terminate(
			@WebParam(name = "Terminate", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") RequestType parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.CardApplicationPathResponse
	 */
	@WebMethod(operationName = "CardApplicationPath", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationPath")
	@WebResult(name = "CardApplicationPathResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public CardApplicationPathResponse cardApplicationPath(
			@WebParam(name = "CardApplicationPath", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationPath parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.CardApplicationConnectResponse
	 */
	@WebMethod(operationName = "CardApplicationConnect", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationConnect")
	@WebResult(name = "CardApplicationConnectResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public CardApplicationConnectResponse cardApplicationConnect(
			@WebParam(name = "CardApplicationConnect", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationConnect parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "CardApplicationDisconnect", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationDisconnect")
	@WebResult(name = "CardApplicationDisconnectResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType cardApplicationDisconnect(
			@WebParam(name = "CardApplicationDisconnect", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationDisconnect parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.CardApplicationStartSessionResponse
	 */
	@WebMethod(operationName = "CardApplicationStartSession", action = "urn:iso:std:iso-iec:24727:tech:schema:StartSession")
	@WebResult(name = "CardApplicationStartSessionResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public CardApplicationStartSessionResponse cardApplicationStartSession(
			@WebParam(name = "CardApplicationStartSession", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationStartSession parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "CardApplicationEndSession", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationEndSession")
	@WebResult(name = "CardApplicationEndSessionResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType cardApplicationEndSession(
			@WebParam(name = "CardApplicationEndSession", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationEndSession parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.CardApplicationListResponse
	 */
	@WebMethod(operationName = "CardApplicationList", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationList")
	@WebResult(name = "CardApplicationListResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public CardApplicationListResponse cardApplicationList(
			@WebParam(name = "CardApplicationList", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationList parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "CardApplicationCreate", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationCreate")
	@WebResult(name = "CardApplicationCreateResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType cardApplicationCreate(
			@WebParam(name = "CardApplicationCreate", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationCreate parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "CardApplicationDelete", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationDelete")
	@WebResult(name = "CardApplicationDeleteResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType cardApplicationDelete(
			@WebParam(name = "CardApplicationDelete", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationDelete parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.CardApplicationServiceListResponse
	 */
	@WebMethod(operationName = "CardApplicationServiceList", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationServiceList")
	@WebResult(name = "CardApplicationServiceListResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public CardApplicationServiceListResponse cardApplicationServiceList(
			@WebParam(name = "CardApplicationServiceList", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationServiceList parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "CardApplicationServiceCreate", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationServiceCreate")
	@WebResult(name = "CardApplicationServiceCreateResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType cardApplicationServiceCreate(
			@WebParam(name = "CardApplicationServiceCreate", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationServiceCreate parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "CardApplicationServiceLoad", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationServiceLoad")
	@WebResult(name = "CardApplicationServiceLoadResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType cardApplicationServiceLoad(
			@WebParam(name = "CardApplicationServiceLoad", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationServiceLoad parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "CardApplicationServiceDelete", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationServiceDelete")
	@WebResult(name = "CardApplicationServiceDeleteResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType cardApplicationServiceDelete(
			@WebParam(name = "CardApplicationServiceDelete", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationServiceDelete parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.CardApplicationServiceDescribeResponse
	 */
	@WebMethod(operationName = "CardApplicationServiceDescribe", action = "urn:iso:std:iso-iec:24727:tech:schema:CardApplicationServiceDescribe")
	@WebResult(name = "CardApplicationServiceDescribeResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public CardApplicationServiceDescribeResponse cardApplicationServiceDescribe(
			@WebParam(name = "CardApplicationServiceDescribe", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") CardApplicationServiceDescribe parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ExecuteActionResponse
	 */
	@WebMethod(operationName = "ExecuteAction", action = "urn:iso:std:iso-iec:24727:tech:schema:ExecuteAction")
	@WebResult(name = "ExecuteActionResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ExecuteActionResponse executeAction(
			@WebParam(name = "ExecuteAction", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") ExecuteAction parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.DataSetListResponse
	 */
	@WebMethod(operationName = "DataSetList", action = "urn:iso:std:iso-iec:24727:tech:schema:DataSetList")
	@WebResult(name = "DataSetListResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public DataSetListResponse dataSetList(
			@WebParam(name = "DataSetList", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DataSetList parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "DataSetCreate", action = "urn:iso:std:iso-iec:24727:tech:schema:DataSetCreate")
	@WebResult(name = "DataSetCreateResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType dataSetCreate(
			@WebParam(name = "DataSetCreate", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DataSetCreate parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "DataSetSelect", action = "urn:iso:std:iso-iec:24727:tech:schema:DataSetSelect")
	@WebResult(name = "DataSetSelectResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType dataSetSelect(
			@WebParam(name = "DataSetSelect", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DataSetSelect parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "DataSetDelete", action = "urn:iso:std:iso-iec:24727:tech:schema:DataSetDelete")
	@WebResult(name = "DataSetDeleteResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType dataSetDelete(
			@WebParam(name = "DataSetDelete", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DataSetDelete parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.DSIListResponse
	 */
	@WebMethod(operationName = "DSIList", action = "urn:iso:std:iso-iec:24727:tech:schema:DSIList")
	@WebResult(name = "DSIListResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public DSIListResponse dsiList(
			@WebParam(name = "DSIList", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DSIList parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "DSICreate", action = "urn:iso:std:iso-iec:24727:tech:schema:DSICreate")
	@WebResult(name = "DSICreateResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType dsiCreate(
			@WebParam(name = "DSICreate", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DSICreate parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "DSIDelete", action = "urn:iso:std:iso-iec:24727:tech:schema:DSIDelete")
	@WebResult(name = "DSIDeleteResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType dsiDelete(
			@WebParam(name = "DSIDelete", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DSIDelete parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "DSIWrite", action = "urn:iso:std:iso-iec:24727:tech:schema:DSIWrite")
	@WebResult(name = "DSIWriteResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType dsiWrite(
			@WebParam(name = "DSIWrite", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DSIWrite parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.DSIReadResponse
	 */
	@WebMethod(operationName = "DSIRead", action = "urn:iso:std:iso-iec:24727:tech:schema:DSIRead")
	@WebResult(name = "DSIReadResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public DSIReadResponse dsiRead(
			@WebParam(name = "DSIRead", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DSIRead parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.EncipherResponse
	 */
	@WebMethod(operationName = "Encipher", action = "urn:iso:std:iso-iec:24727:tech:schema:Encipher")
	@WebResult(name = "EncipherResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public EncipherResponse encipher(
			@WebParam(name = "Encipher", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") Encipher parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.DecipherResponse
	 */
	@WebMethod(operationName = "Decipher", action = "urn:iso:std:iso-iec:24727:tech:schema:Decipher")
	@WebResult(name = "DecipherResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public DecipherResponse decipher(
			@WebParam(name = "Decipher", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") Decipher parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.GetRandomResponse
	 */
	@WebMethod(operationName = "GetRandom", action = "urn:iso:std:iso-iec:24727:tech:schema:GetRandom")
	@WebResult(name = "GetRandomResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public GetRandomResponse getRandom(
			@WebParam(name = "GetRandom", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") GetRandom parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.HashResponse
	 */
	@WebMethod(operationName = "Hash", action = "urn:iso:std:iso-iec:24727:tech:schema:Hash")
	@WebResult(name = "HashResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public HashResponse hash(@WebParam(name = "Hash", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") Hash parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.SignResponse
	 */
	@WebMethod(operationName = "Sign", action = "urn:iso:std:iso-iec:24727:tech:schema:Sign")
	@WebResult(name = "SignResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public SignResponse sign(@WebParam(name = "Sign", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") Sign parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "VerifySignature", action = "urn:iso:std:iso-iec:24727:tech:schema:VerifySignature")
	@WebResult(name = "VerifySignatureResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType verifySignature(
			@WebParam(name = "VerifySignature", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") VerifySignature parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "VerifyCertificate", action = "urn:iso:std:iso-iec:24727:tech:schema:VerifyCertificate")
	@WebResult(name = "VerifyCertificateResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType verifyCertificate(
			@WebParam(name = "VerifyCertificate", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") VerifyCertificate parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.DIDListResponse
	 */
	@WebMethod(operationName = "DIDList", action = "urn:iso:std:iso-iec:24727:tech:schema:DIDList")
	@WebResult(name = "DIDListResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public DIDListResponse didList(
			@WebParam(name = "DIDList", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DIDList parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "DIDCreate", action = "urn:iso:std:iso-iec:24727:tech:schema:DIDCreate")
	@WebResult(name = "DIDCreateResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType didCreate(
			@WebParam(name = "DIDCreate", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DIDCreate parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.DIDGetResponse
	 */
	@WebMethod(operationName = "DIDGet", action = "urn:iso:std:iso-iec:24727:tech:schema:DIDGet")
	@WebResult(name = "DIDGetResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public DIDGetResponse didGet(
			@WebParam(name = "DIDGet", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DIDGet parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "DIDUpdate", action = "urn:iso:std:iso-iec:24727:tech:schema:DIDUpdate")
	@WebResult(name = "DIDUpdateResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType didUpdate(
			@WebParam(name = "DIDUpdate", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DIDUpdate parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "DIDDelete", action = "urn:iso:std:iso-iec:24727:tech:schema:DIDDelete")
	@WebResult(name = "DIDDeleteResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType didDelete(
			@WebParam(name = "DIDDelete", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DIDDelete parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.DIDAuthenticateResponse
	 */
	@WebMethod(operationName = "DIDAuthenticate", action = "urn:iso:std:iso-iec:24727:tech:schema:DIDAuthenticate")
	@WebResult(name = "DIDAuthenticateResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public DIDAuthenticateResponse didAuthenticate(
			@WebParam(name = "DIDAuthenticate", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") DIDAuthenticate parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ACLListResponse
	 */
	@WebMethod(operationName = "ACLList", action = "urn:iso:std:iso-iec:24727:tech:schema:ACLList")
	@WebResult(name = "ACLListResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ACLListResponse aclList(
			@WebParam(name = "ACLList", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") ACLList parameters);

	/**
	 * 
	 * @param parameters
	 * @return returns iso.std.iso_iec._24727.tech.schema.ResponseType
	 */
	@WebMethod(operationName = "ACLModify", action = "urn:iso:std:iso-iec:24727:tech:schema:ACLModify")
	@WebResult(name = "ACLModifyResponse", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters")
	public ResponseType aclModify(
			@WebParam(name = "ACLModify", targetNamespace = "urn:iso:std:iso-iec:24727:tech:schema", partName = "parameters") ACLModify parameters);

}
