# eMaturaConverter
This is an ad hoc solution for converting data used by [eMatura](https://github.com/arminrejzovic/ematura_old) app to JSON, which is more
appropriate for reading and usage by other programs. 

It's essentially a set of modified classes from the original software used to load the data, and then the converter uses Gson to easily convert
the loaded data into JSON, which is saved in two files, one compact and one with fancy spacings.
