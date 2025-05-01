.class Lcom/join/mgps/fragment/MyArchiveFragment$e;
.super Ljava/lang/Object;
.source "MyArchiveFragment.java"

# interfaces
.implements Lcom/join/mgps/dialog/w$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/MyArchiveFragment;->H0(Lcom/join/mgps/dto/CloudListDataBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/dto/CloudListDataBean;

.field final synthetic b:Lcom/join/mgps/fragment/MyArchiveFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/MyArchiveFragment;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$e;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    iput-object p2, p0, Lcom/join/mgps/fragment/MyArchiveFragment$e;->a:Lcom/join/mgps/dto/CloudListDataBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/dialog/w;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment$e;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    iget-object v1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$e;->a:Lcom/join/mgps/dto/CloudListDataBean;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/MyArchiveFragment;->d0(Lcom/join/mgps/fragment/MyArchiveFragment;Lcom/join/mgps/dto/CloudListDataBean;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/MyArchiveFragment$e;->b:Lcom/join/mgps/fragment/MyArchiveFragment;

    iget-boolean v1, v0, Lcom/join/mgps/fragment/MyArchiveFragment;->L:Z

    if-nez v1, :cond_0

    .line 3
    iget-object v0, v0, Lcom/join/mgps/fragment/MyArchiveFragment;->n:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->uploadRecoderNotice()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
