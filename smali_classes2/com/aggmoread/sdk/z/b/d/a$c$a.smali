.class Lcom/aggmoread/sdk/z/b/d/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/b/d/a$c;->a(Landroid/view/View;Lcom/aggmoread/sdk/z/a/g/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/b/d/a$c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/d/a$c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c$a;->a:Lcom/aggmoread/sdk/z/b/d/a$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$c$a;->a:Lcom/aggmoread/sdk/z/b/d/a$c;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/b/d/a$c;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->e(Lcom/aggmoread/sdk/z/b/d/a;)V

    const/4 p1, 0x0

    return p1
.end method
