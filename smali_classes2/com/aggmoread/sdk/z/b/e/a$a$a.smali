.class Lcom/aggmoread/sdk/z/b/e/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/b/e/a$a;-><init>(Lcom/aggmoread/sdk/z/b/e/a;Landroid/content/Context;Ljava/lang/String;Lcom/aggmoread/sdk/z/b/e/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/b/e/a$a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/e/a$a;Lcom/aggmoread/sdk/z/b/e/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/e/a$a$a;->a:Lcom/aggmoread/sdk/z/b/e/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    const-string p1, "AIWTAG"

    const-string v0, "c c"

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/e/a$a$a;->a:Lcom/aggmoread/sdk/z/b/e/a$a;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
