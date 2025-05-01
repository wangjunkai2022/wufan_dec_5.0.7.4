.class Lcom/MApplication$g$a;
.super Ljava/lang/Object;
.source "MApplication.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/MApplication$g;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/MApplication$g;


# direct methods
.method constructor <init>(Lcom/MApplication$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/MApplication$g$a;->b:Lcom/MApplication$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/MApplication$g$a;->b:Lcom/MApplication$g;

    iget-object v0, v0, Lcom/MApplication$g;->a:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->E()V

    return-void
.end method
