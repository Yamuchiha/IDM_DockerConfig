/**
 */
package dockerConfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockerConfig.Port#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link dockerConfig.Port#getContainerPort <em>Container Port</em>}</li>
 * </ul>
 *
 * @see dockerConfig.DockerConfigPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Port</em>' attribute.
	 * @see #setHostPort(String)
	 * @see dockerConfig.DockerConfigPackage#getPort_HostPort()
	 * @model
	 * @generated
	 */
	String getHostPort();

	/**
	 * Sets the value of the '{@link dockerConfig.Port#getHostPort <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Port</em>' attribute.
	 * @see #getHostPort()
	 * @generated
	 */
	void setHostPort(String value);

	/**
	 * Returns the value of the '<em><b>Container Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Port</em>' attribute.
	 * @see #setContainerPort(String)
	 * @see dockerConfig.DockerConfigPackage#getPort_ContainerPort()
	 * @model
	 * @generated
	 */
	String getContainerPort();

	/**
	 * Sets the value of the '{@link dockerConfig.Port#getContainerPort <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Port</em>' attribute.
	 * @see #getContainerPort()
	 * @generated
	 */
	void setContainerPort(String value);

} // Port
