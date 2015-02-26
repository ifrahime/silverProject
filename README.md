# Silver@home 
Une plateforme dynamique permettant de receuillir les données du patient et d'exécuter certaines règles sur le "Poids", afin de générer le type d'alerte (JAUNE : Prise de poids de 1 KG, ORANGE : Prise de poids de 2KG, ROUGE : Prise de poids > 2KG) qui correspond à un patient donnée.


![alt tag](http://i.imgur.com/AGjZO4Y.png)


La plateforme est construite : <br />
FRONTEND : HTML - JAVASCRIPT - CSS(Template BOOSTRAP)<br />
BACKEND : JAVA (Hibernate - Base de donnée MySQL)<br />

Pour utiliser la plateforme il suffit juste de télécharger le fichier .war dans le dossier target/ puis le déployer à l'aide du tomcat manager. <br />
[Tomcat tutorial](http://www.vogella.com/tutorials/ApacheTomcat/article.html)<br />

La plateforme communique avec une base de donnée de type MySql dont le fichier est mis avec le projet, il suffit juste de changer le mot de passe de la base de donnée dans le fichier "hibernate.cfg.xml".<br />

