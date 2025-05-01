.class Lcom/join/mgps/fragment/RecommedFragment$h;
.super Ljava/lang/Object;
.source "RecommedFragment.java"

# interfaces
.implements Lcom/join/mgps/dialog/w$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/RecommedFragment;->v(Lcom/join/mgps/dto/CloudListDataBean;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/dto/CloudListDataBean;

.field final synthetic b:Lcom/join/mgps/fragment/RecommedFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/RecommedFragment;Lcom/join/mgps/dto/CloudListDataBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/RecommedFragment$h;->b:Lcom/join/mgps/fragment/RecommedFragment;

    iput-object p2, p0, Lcom/join/mgps/fragment/RecommedFragment$h;->a:Lcom/join/mgps/dto/CloudListDataBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/dialog/w;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/RecommedFragment$h;->b:Lcom/join/mgps/fragment/RecommedFragment;

    iget-object v1, p0, Lcom/join/mgps/fragment/RecommedFragment$h;->a:Lcom/join/mgps/dto/CloudListDataBean;

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/RecommedFragment;->j0(Lcom/join/mgps/dto/CloudListDataBean;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/RecommedFragment$h;->b:Lcom/join/mgps/fragment/RecommedFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/RecommedFragment;->a0(Lcom/join/mgps/fragment/RecommedFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/RecommedFragment$h;->b:Lcom/join/mgps/fragment/RecommedFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/RecommedFragment;->m:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->DownloadRecoderNoticeMarcket()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
