/**
 */
package dockerConfig.impl;

import dockerConfig.DockerConfigPackage;
import dockerConfig.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockerConfig.impl.PortImpl#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link dockerConfig.impl.PortImpl#getContainerPort <em>Container Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port {
	/**
	 * The default value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected String hostPort = HOST_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerPort() <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerPort() <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPort()
	 * @generated
	 * @ordered
	 */
	protected String containerPort = CONTAINER_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerConfigPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostPort() {
		return hostPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostPort(String newHostPort) {
		String oldHostPort = hostPort;
		hostPort = newHostPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerConfigPackage.PORT__HOST_PORT, oldHostPort,
					hostPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerPort() {
		return containerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPort(String newContainerPort) {
		String oldContainerPort = containerPort;
		containerPort = newContainerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerConfigPackage.PORT__CONTAINER_PORT,
					oldContainerPort, containerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockerConfigPackage.PORT__HOST_PORT:
			return getHostPort();
		case DockerConfigPackage.PORT__CONTAINER_PORT:
			return getContainerPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DockerConfigPackage.PORT__HOST_PORT:
			setHostPort((String) newValue);
			return;
		case DockerConfigPackage.PORT__CONTAINER_PORT:
			setContainerPort((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DockerConfigPackage.PORT__HOST_PORT:
			setHostPort(HOST_PORT_EDEFAULT);
			return;
		case DockerConfigPackage.PORT__CONTAINER_PORT:
			setContainerPort(CONTAINER_PORT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DockerConfigPackage.PORT__HOST_PORT:
			return HOST_PORT_EDEFAULT == null ? hostPort != null : !HOST_PORT_EDEFAULT.equals(hostPort);
		case DockerConfigPackage.PORT__CONTAINER_PORT:
			return CONTAINER_PORT_EDEFAULT == null ? containerPort != null
					: !CONTAINER_PORT_EDEFAULT.equals(containerPort);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hostPort: ");
		result.append(hostPort);
		result.append(", containerPort: ");
		result.append(containerPort);
		result.append(')');
		return result.toString();
	}

} //PortImpl
