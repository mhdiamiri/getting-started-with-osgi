# OSGi Example Application

This project is a simple **OSGi application** built with **Apache Felix** as the runtime framework and **Maven** as the build and dependency manager.  
It demonstrates how to create and run multiple OSGi bundles that interact with each other.

---

## Technologies Used

- **Java** – Programming language for the bundles (Java 17 recommended).  
- **Apache Felix** – Lightweight OSGi framework implementation used to run the application.  
- **Maven** – Build automation and dependency management tool.  
- **Maven Bundle Plugin (`org.apache.felix:maven-bundle-plugin`)** – Used to generate OSGi-compliant `MANIFEST.MF` files with bundle metadata (e.g., `Bundle-Activator`, `Export-Package`, `Import-Package`).  
- **OSGi Core (`org.osgi:org.osgi.core`)** – Provides the `BundleActivator` interface and essential OSGi APIs.  
