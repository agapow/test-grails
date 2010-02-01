class Isolate {

   static transients = [
      // fields not to persist
   ]
   static constraints = {
      // restrictions on fields
      releaseDate(nullable: true)
      created(nullable: true)
      updated(nullable: true)
   }
   
   String strain
   String serotype
   String host
   String isolation_source
   String passage_history
   String country
   Date collected
   String note
   Integer epidemic_id
   String data_source
   String region
   Boolean cultured
   String local_identifier
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
