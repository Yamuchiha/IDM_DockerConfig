/*
 * generated by Xtext 2.35.0
 */
package org.xtext.formatting2

import com.google.inject.Inject
import dockerConfig.Service
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.services.DockerConfigGrammarAccess

class DockerConfigFormatter extends AbstractFormatter2 {
	
	@Inject extension DockerConfigGrammarAccess

	def dispatch void format(Service service, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (port : service.ports) {
			port.format
		}
		for (volume : service.volumes) {
			volume.format
		}
	}
	
}
