#include <linux/init.h>
#include <linux/module.h>
#include <linux/kernel.h>
MODULE_LICENSE("GPL"); ///< tipo de licencia
MODULE_AUTHOR("Amador Carmona y Manuel Zafra"); ///< Autores
MODULE_DESCRIPTION("Un simple controlador de Linux."); ///< descripción
MODULE_VERSION("0.1"); ///< Versión del módulo
static char *name = "Mundo";
module_param(name, charp, S_IRUGO);
MODULE_PARM_DESC(name, "El nombre para mostrar en el registro");
/** @brief The LKM initialization function
* @return returns 0 if successful
*/
static int __init helloBBB_init(void){
	printk(KERN_INFO "EBB: Hola %s desde el BBB LKM!\n", name);
	return 0;
}
/** @brief The LKM cleanup function
*/
static void __exit helloBBB_exit(void){
	printk(KERN_INFO "EBB: Adios %s desde el BBB LKM!\n", name);
}
/** @brief Identify the initialization function at insertion
time and the cleanup function
*/
module_init(helloBBB_init);
module_exit(helloBBB_exit);

