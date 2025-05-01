.class Lcom/join/mgps/activity/PapaMainV3Fragment$c;
.super Ljava/lang/Object;
.source "PapaMainV3Fragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/PapaMainV3Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/PapaMainV3Fragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/join/mgps/activity/PapaMainV3Fragment;->S1:Z

    .line 2
    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->k0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    iget-object v0, v0, Lcom/join/mgps/activity/PapaMainV3Fragment;->z:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isFirstCommendVersion()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    iget-object v0, v0, Lcom/join/mgps/activity/PapaMainV3Fragment;->z:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isFirst35()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    iget-object v2, v0, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    if-eqz v2, :cond_2

    .line 5
    invoke-virtual {v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->getLastCompletelyVisiblePosition()I

    move-result v2

    invoke-static {v0, v2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->d0(Lcom/join/mgps/activity/PapaMainV3Fragment;I)I

    :cond_2
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->A0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_d

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->c0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I

    move-result v2

    if-gt v0, v2, :cond_c

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->A0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/MgpapaMainItemBean;

    .line 9
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->isHasExposure()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_6

    .line 10
    :cond_3
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result v3

    const/4 v4, 0x4

    const-string v5, "206"

    const/4 v6, 0x1

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_5

    .line 11
    :pswitch_1
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->p0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I

    .line 12
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->o0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I

    move-result v4

    invoke-static {v3, v4}, Lcom/join/mgps/activity/PapaMainV3Fragment;->r0(Lcom/join/mgps/activity/PapaMainV3Fragment;I)V

    goto/16 :goto_5

    .line 13
    :pswitch_2
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    if-eqz v3, :cond_b

    .line 14
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    const-string v5, "203"

    invoke-static {v4, v5, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l0(Lcom/join/mgps/activity/PapaMainV3Fragment;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    .line 15
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    sget-object v5, Lcom/psk/eventmodule/Event;->exposure:Lcom/psk/eventmodule/Event;

    invoke-static {v4, v5, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->m0(Lcom/join/mgps/activity/PapaMainV3Fragment;Lcom/psk/eventmodule/Event;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    goto/16 :goto_5

    .line 16
    :pswitch_3
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    if-eqz v3, :cond_b

    .line 17
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    const-string v5, "201"

    invoke-static {v4, v5, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l0(Lcom/join/mgps/activity/PapaMainV3Fragment;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    .line 18
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    sget-object v5, Lcom/psk/eventmodule/Event;->exposure:Lcom/psk/eventmodule/Event;

    invoke-static {v4, v5, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->m0(Lcom/join/mgps/activity/PapaMainV3Fragment;Lcom/psk/eventmodule/Event;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    goto/16 :goto_5

    .line 19
    :pswitch_4
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    .line 20
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v4, v5, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l0(Lcom/join/mgps/activity/PapaMainV3Fragment;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    goto/16 :goto_5

    .line 21
    :pswitch_5
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_b

    .line 22
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-lez v7, :cond_b

    const/4 v7, 0x0

    .line 23
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_6

    if-lt v7, v4, :cond_4

    goto :goto_2

    .line 24
    :cond_4
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    if-eqz v8, :cond_5

    .line 25
    iget-object v9, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v9, v5, v8}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l0(Lcom/join/mgps/activity/PapaMainV3Fragment;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    .line 26
    invoke-virtual {v8, v6}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->setHasExposure(Z)V

    .line 27
    invoke-interface {v3, v7, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 28
    :cond_6
    :goto_2
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 29
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->A0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    .line 30
    :pswitch_6
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    if-eqz v3, :cond_b

    .line 31
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v4, v5, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l0(Lcom/join/mgps/activity/PapaMainV3Fragment;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    goto/16 :goto_5

    .line 32
    :pswitch_7
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;

    if-eqz v3, :cond_b

    .line 33
    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getList()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_b

    .line 34
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$RankingListDTO;->getList()Ljava/util/List;

    move-result-object v3

    const-string v5, "20501"

    invoke-static {v4, v1, v3, v5}, Lcom/join/mgps/activity/PapaMainV3Fragment;->z0(Lcom/join/mgps/activity/PapaMainV3Fragment;ILjava/util/List;Ljava/lang/String;)V

    goto/16 :goto_5

    .line 35
    :pswitch_8
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_b

    .line 36
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_b

    const/4 v5, 0x0

    .line 37
    :goto_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_9

    if-lt v5, v4, :cond_7

    goto :goto_4

    .line 38
    :cond_7
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;

    if-eqz v7, :cond_8

    .line 39
    iget-object v8, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-virtual {v7}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getPosition()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->getId()Ljava/lang/String;

    move-result-object v10

    const-string v11, "204"

    invoke-static {v8, v11, v9, v10}, Lcom/join/mgps/activity/PapaMainV3Fragment;->n0(Lcom/join/mgps/activity/PapaMainV3Fragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    invoke-virtual {v7, v6}, Lcom/join/mgps/dto/PAPAHomeBeanV7$NgSelectionDTO;->setHasExposure(Z)V

    .line 41
    invoke-interface {v3, v5, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 42
    :cond_9
    :goto_4
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setObject(Ljava/lang/Object;)V

    .line 43
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->A0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 44
    :pswitch_9
    invoke-virtual {v2}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getObject()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    if-eqz v3, :cond_b

    .line 45
    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v4

    const-string v5, "22-11-1"

    invoke-static {v4, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 46
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    const-string v5, "20201"

    invoke-static {v4, v5, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l0(Lcom/join/mgps/activity/PapaMainV3Fragment;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    goto :goto_5

    .line 47
    :cond_a
    invoke-virtual {v3}, Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;->getPosition()Ljava/lang/String;

    move-result-object v4

    const-string v5, "22-12-1"

    invoke-static {v4, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 48
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$c;->b:Lcom/join/mgps/activity/PapaMainV3Fragment;

    const-string v5, "20202"

    invoke-static {v4, v5, v3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->l0(Lcom/join/mgps/activity/PapaMainV3Fragment;Ljava/lang/String;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;)V

    .line 49
    :cond_b
    :goto_5
    invoke-virtual {v2, v6}, Lcom/join/mgps/dto/MgpapaMainItemBean;->setHasExposure(Z)V

    :cond_c
    :goto_6
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1d
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_9
    .end packed-switch
.end method
