/**
 */
package dockerConfig.impl;

import dockerConfig.DockerConfigPackage;
import dockerConfig.Volume;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dockerConfig.impl.VolumeImpl#getHostPath <em>Host Path</em>}</li>
 *   <li>{@link dockerConfig.impl.VolumeImpl#getContainerPath <em>Container Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends MinimalEObjectImpl.Container implements Volume {
	/**
	 * The default value of the '{@link #getHostPath() <em>Host Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPath()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostPath() <em>Host Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPath()
	 * @generated
	 * @ordered
	 */
	protected String hostPath = HOST_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerPath() <em>Container Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerPath() <em>Container Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPath()
	 * @generated
	 * @ordered
	 */
	protected String containerPath = CONTAINER_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerConfigPackage.Literals.VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostPath() {
		return hostPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostPath(String newHostPath) {
		String oldHostPath = hostPath;
		hostPath = newHostPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerConfigPackage.VOLUME__HOST_PATH, oldHostPath,
					hostPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerPath() {
		return containerPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerPath(String newContainerPath) {
		String oldContainerPath = containerPath;
		containerPath = newContainerPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerConfigPackage.VOLUME__CONTAINER_PATH,
					oldContainerPath, containerPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockerConfigPackage.VOLUME__HOST_PATH:
			return getHostPath();
		case DockerConfigPackage.VOLUME__CONTAINER_PATH:
			return getContainerPath();
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
		case DockerConfigPackage.VOLUME__HOST_PATH:
			setHostPath((String) newValue);
			return;
		case DockerConfigPackage.VOLUME__CONTAINER_PATH:
			setContainerPath((String) newValue);
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
		case DockerConfigPackage.VOLUME__HOST_PATH:
			setHostPath(HOST_PATH_EDEFAULT);
			return;
		case DockerConfigPackage.VOLUME__CONTAINER_PATH:
			setContainerPath(CONTAINER_PATH_EDEFAULT);
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
		case DockerConfigPackage.VOLUME__HOST_PATH:
			return HOST_PATH_EDEFAULT == null ? hostPath != null : !HOST_PATH_EDEFAULT.equals(hostPath);
		case DockerConfigPackage.VOLUME__CONTAINER_PATH:
			return CONTAINER_PATH_EDEFAULT == null ? containerPath != null
					: !CONTAINER_PATH_EDEFAULT.equals(containerPath);
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
		result.append(" (hostPath: ");
		result.append(hostPath);
		result.append(", containerPath: ");
		result.append(containerPath);
		result.append(')');
		return result.toString();
	}

} //VolumeImpl
