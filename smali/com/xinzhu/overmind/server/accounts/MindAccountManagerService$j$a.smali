.class Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j$a;
.super Ljava/lang/Object;
.source "MindAccountManagerService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j;->a(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j;


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j$a;->c:Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j;

    iput-object p2, p0, Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j$a;->c:Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j;

    iget-object v0, v0, Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j;->a:Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService;

    invoke-static {v0}, Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService;->access$100(Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService;)V

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j$a;->c:Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j;

    iget-object v0, v0, Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j;->a:Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService;

    iget-object v1, p0, Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService$j$a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService;->access$200(Lcom/xinzhu/overmind/server/accounts/MindAccountManagerService;Ljava/lang/String;)V

    return-void
.end method
