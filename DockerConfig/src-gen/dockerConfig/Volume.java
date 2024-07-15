/**
 */
package dockerConfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dockerConfig.Volume#getHostPath <em>Host Path</em>}</li>
 *   <li>{@link dockerConfig.Volume#getContainerPath <em>Container Path</em>}</li>
 * </ul>
 *
 * @see dockerConfig.DockerConfigPackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Host Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Path</em>' attribute.
	 * @see #setHostPath(String)
	 * @see dockerConfig.DockerConfigPackage#getVolume_HostPath()
	 * @model
	 * @generated
	 */
	String getHostPath();

	/**
	 * Sets the value of the '{@link dockerConfig.Volume#getHostPath <em>Host Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Path</em>' attribute.
	 * @see #getHostPath()
	 * @generated
	 */
	void setHostPath(String value);

	/**
	 * Returns the value of the '<em><b>Container Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Path</em>' attribute.
	 * @see #setContainerPath(String)
	 * @see dockerConfig.DockerConfigPackage#getVolume_ContainerPath()
	 * @model
	 * @generated
	 */
	String getContainerPath();

	/**
	 * Sets the value of the '{@link dockerConfig.Volume#getContainerPath <em>Container Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Path</em>' attribute.
	 * @see #getContainerPath()
	 * @generated
	 */
	void setContainerPath(String value);

} // Volume
