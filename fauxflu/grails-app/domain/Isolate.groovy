class Isolate {

   static transients = [
      # fields not to persist
   ]
   static constraints = {
      # restrictions on fields
      releaseDate(nullable: true)
      created(nullable: true)
      updated(nullable: true)
   }
   
   String strain
   String serotype
   String host character varying(255),
   String isolation_source character varying(255),
   String passage_history character varying(255),
   String country character varying(255),
   Date collected
   
   note text,

   epidemic_id integer,
   
   String data_source character varying(255),
   String region character varying(255),
   
   cultured boolean,
   String local_identifier character varying(255),
   
   CONSTRAINT isolates_pkey PRIMARY KEY (id)

   Date created
   Date updated
   
   def beforeInsert = {
      created = new Date()
      updated = new Date()
   }
   
   def beforeUpdate = {
      updated = new Date()
   }
}
